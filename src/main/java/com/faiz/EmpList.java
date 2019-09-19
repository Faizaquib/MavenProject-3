package com.faiz;
import java.util.List;

import org.hibernate.Criteria;

public class EmpList {

	public static void main(String[] args) {


		Criteria cr = Util.getSF().openSession().createCriteria(Emp.class);
		List<Emp> emps = cr.list();
		for(Emp e : emps)
		{
			System.out.println(e.getEno());
			System.out.println(e.getEname());
			System.out.println(e.getSal());
			System.out.println(e.getLaptop().getBrand());
			System.out.println(e.getLaptop().getCode());
			System.out.println(e.getVehicle().getVname());
			System.out.println(e.getVehicle().getRegno());
			System.out.println("______________________________");
		}

	}

}
