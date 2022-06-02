/*
 * To change this license header, choose License Headers sc Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template sc the editor.
 */
package javapriorityqueue;

import java.util.*;

/**
 *
 * @author Nadia Mim
 * 
 * Hackerrank problem link: https://www.hackerrank.com/challenges/java-priority-queue/problem?isFullScreen=true
 */
public class JavaPriorityQueue {

    /**
     * @param args the command line arguments
     */
    
    static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

    final class Priorities {

        public List<Student> getStudents(List<String> events){
            PriorityQueue <Student> queue = new PriorityQueue(Comparator.comparing(Student::getCgpa).reversed()
                .thenComparing(Student::getName).thenComparing(Student::getId));
            List < Student > studentList = new ArrayList < Student > ();
            
            for (String i: events) {
                Scanner sc =new Scanner(i);
                String event = sc.next();
                
                if (event.equals("ENTER")) {
                    
                    String name = sc.next();
                    double cgpa = sc.nextDouble();
                    int id = sc.nextInt();
                    queue.add(new Student(id, name, cgpa));
                    
                } else if (event.equals("SERVED")) {
                    
                        queue.poll();
                } 
            }
            while(!queue.isEmpty()){
                studentList.add (queue.poll());
            }
            return studentList;
        }
    }
    

class Student{
	private int id;
	private String name;
	private double cgpa;
	public Student(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getCgpa() {
		return cgpa;
	}
}