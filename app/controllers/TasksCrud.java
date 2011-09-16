package controllers;

import models.Task;
import controllers.elasticsearch.ElasticSearchController;

@ElasticSearchController.For(Task.class)
public class TasksCrud extends ElasticSearchController{
}
