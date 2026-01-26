package com.annotations.taskinfo;

import java.lang.reflect.Method;

public class UseTaskInfo {
	public static void main(String[] args) {
		TaskManager manager = new TaskManager();
		manager.completeTask();

		// Reading annotation using Reflection
		Method[] methods = TaskManager.class.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(TaskInfo.class)) {
				TaskInfo info = method.getAnnotation(TaskInfo.class);

				System.out.println("Priority : " + info.priority());
				System.out.println("Assigned To : " + info.assignedTo());
			}
		}
	}
}