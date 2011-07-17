package controllers;

import java.util.List;

import models.Task;

import org.elasticsearch.index.query.xcontent.QueryBuilders;

import play.data.validation.Required;
import play.modules.elasticsearch.ElasticSearch;
import play.modules.elasticsearch.search.SearchResults;
import play.mvc.Controller;

public class Tasks extends Controller{

	public static void index(){
		List<Task> tasks = Task.findAll();
		render(tasks);
	}
	
	public static void create(@Required String label){
		Task t = new Task(label);
		t.save();
		index();
	}
	
	public static void search(String label){
		SearchResults<Task> list = ElasticSearch.search(QueryBuilders.fieldQuery("label", label), Task.class);
		render(list);
	}
	
	public static void test(){	
	}
}
