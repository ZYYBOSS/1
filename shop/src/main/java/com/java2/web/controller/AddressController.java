package com.java2.web.controller;
/*
 编码标准：CheckStyle 插件
 功能：检查编码的规范
 例子：http://blog.csdn.net/zmx729618/article/details/51697657
 详细版例子：http://blog.csdn.net/yang1982_0907/article/details/18086693
 
 
代码重复：PMD的CPD 插件
检查出：潜在的bug
      未使用的代码（局部变量，参数，私有方法……）
      不必要的if语句，for循环
      重复代码（copy的）
      在循环体内创建的新对象
      是否关闭资源

代码覆盖率：Eclemma 插件
绿色：完整执行  红色：没执行  黄色：部分执行


依赖项分析：JDepend 插件
实现类与抽象接口的数目：指出了包的稳定程度与它的抽象程度（接口的数目）成正比，也就是说，一个包内包含的接口所占的比重越大，这个包就越稳定
包的抽象度。指一个包内包含的抽象类或接口占整个包中的类的比重。该值处于0，1之间，若A=0，说明包内不包含任何抽象类或接口；若A=1,说明包内全部是抽象类或接口。包的抽象度与稳定性之间的关系上面已经作了说明。
向心耦合。依赖该包（包含的类）的外部包（类）的数目，该数值越大，说明该包的担当的职责越大，也就越稳定。
离心耦合。被该包依赖的外部包的数目，该数值越大，说明该包越不独立（因为依赖了别的包），也越不稳定。
包的循环依赖度：要求包之间不能有循环依赖关系

复杂度分析：Eclipse Metric 插件


 * 
 * */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java2.web.dtos.AddressDTO;
import com.java2.web.service.AddressService;

@RestController
@RequestMapping(path = "/addresses")
public class AddressController {

	@Autowired
	private AddressService addressService;

	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<AddressDTO> getAddress() {
		return addressService.getAddresss();
	}

	@RequestMapping(path = "", method = RequestMethod.POST)
	public void addAddress(@RequestBody AddressDTO address) {
		addressService.addAddress(address);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void deleteAddress(@PathVariable Long id) {
		addressService.deleteAddress(id);
	}

	@RequestMapping(path = "", method = RequestMethod.PUT)
	public void uptateAddress(@RequestBody AddressDTO address) {
		addressService.updateAddress(address);
	}

	public AddressService getAddressService() {
		return addressService;
	}

	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}

}