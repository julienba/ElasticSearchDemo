package controllers;

import models.Task;

@ElasticSearchController.For(Task.class)
public class TasksCrud extends ElasticSearchController{
}
