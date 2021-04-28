package com.tyss.test;
package com.te.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.bean.Student;

public class StudentTest {
	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
			Student student =(Student)context.getBean("act");
			System.out.println(student.getSid());
			System.out.println(student.getSname());
			System.out.println(student.getGadgets());
			System.out.println(student.getGadgets().getModel_name());
			System.out.println(student.getGadgets().getPrice());
			System.out.println(student.getGadgets().getGadget());
			((AbstractApplicationContext)context).close();

		}

	}
}
