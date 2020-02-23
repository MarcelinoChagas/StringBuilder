package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(
				sdf.parse("2020/02/23 07:58:00"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("Good nigth");
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(
				sdf.parse("2020/02/22 06:18:00"),
				"Good night guys",
				"See you tomorrow",
				9);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
