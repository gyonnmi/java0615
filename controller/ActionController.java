package org.project.controller;

import java.util.Scanner;

import org.project.commend.ActionDelete;
import org.project.commend.ActionInsert;
import org.project.commend.ActionSelect;
import org.project.commend.ActionUpdate;

public class ActionController {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		//Scanner�̿�
		// ������ �Է� �ϼ���
		
		while(true) {
			System.out.println("�Է��ϼ���.(insert, select, update, delete)");
			String str=scn.next();
			
			if(str.equals("insert")) {
				ActionInsert insert=new ActionInsert();
				insert.excuteQuery();
			} else if(str.equals("update")) {
				ActionUpdate update=new ActionUpdate();
				update.excuteQuery();
			} else if(str.equals("select")) {
				ActionSelect select=new ActionSelect();
				select.excuteQuery();
			} else if(str.equals("delete")) {
				ActionDelete delete=new ActionDelete();
				delete.excuteQuery();
			} else if(str.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
		scn.close();
	}
}
