package looking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository("LookEntity")
public class Report implements Runnable {
	//标记时间
	private Date nowTime = new Date();
	private DateFormat time = DateFormat.getTimeInstance();

	String str;

	private List<LookEntity> nowList = new ArrayList<>();
	private List<LookEntity> saveList = new ArrayList<>(); // 用来存上一次的值，和下一次对比
	private List<Long> idList = new ArrayList<>();
	
	
	// 将list存入Map中
	public Map<Long, LookEntity> listToMap(List<LookEntity> list) {
		Map<Long, LookEntity> map = new HashMap<>();
		for (int i = 0; i < map.size(); i++) {
			map.put(list.get(i).getId(), list.get(i));
		}
		return map;
	}

	// 输出一句话到一个文件中
	public void print(String str) {
		try (OutputStream os = new FileOutputStream(new File("./looking.log"), true);
				Writer writer = new OutputStreamWriter(os);
				BufferedWriter bf = new BufferedWriter(writer)) {
			os.write(str.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@PersistenceContext
	EntityManager em;

	@Override
	public void run() {
		try {
			// 取得数据库现在所有的
			nowList = em.createQuery("from LookEntity", LookEntity.class).getResultList();

			Map<Long, LookEntity> nowMap = listToMap(nowList);
			Map<Long, LookEntity> saveMap = listToMap(saveList); // 全部转成map

			for (int i = 0; i < nowList.size(); i++) {
				idList.add(nowList.get(i).getId()); // 取得nowlist中所有id号
			}
			// 一次循环找出了增，改
			for (int i = 0; i < nowList.size(); i++) {
				if (saveMap.get(idList.get(i)) == null) {
					str = time.format(nowTime) + "增添了数据，id =" + idList.get(i) + "\n";
				} else {

					LookEntity nowlook = nowMap.get(idList.get(i));
					LookEntity savelook = saveMap.get(idList.get(i)); // 取出id相同的两个元素，对比成员变量

					if (nowlook.getName().equals(savelook.getName())) {
						str = time.format(nowTime) + "修改了name，id=" + idList.get(i) + "\n";
						print(str);
					} else if (nowlook.getPrice() != savelook.getPrice()) {
						str = time.format(nowTime) + "修改了price，id=" + idList.get(i) + "\n";
						print(str);
					} else if (nowlook.isState() != savelook.isState()) {
						str = time.format(nowTime) + "修改了state，id=" + idList.get(i) + "\n";
						print(str);
					}
				}
			}

			// 删除只能用另一个for写
			for (int i = 0; i < saveList.size(); i++) {
				idList.add(saveList.get(i).getId()); // 取得savelist中所有id号
			}
			for (int i = 0; i < saveList.size(); i++) {
				if (nowMap.get(idList.get(i)) == null) {
					str = time.format(nowTime) + "删除了数据，id =" + idList.get(i) + "\n";
					print(str);
				}
			}
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Runnable run = new Report();
		Thread t = new Thread(run);

		t.start();
	}
}
