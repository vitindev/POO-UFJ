package com.vitindev.jobs.two.dao;

import com.vitindev.jobs.two.model.Model;
import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class ModelDAO {

    private final List<Model> models = new LinkedList<>();

    public boolean addModel(Model model) {
        return models.add(model);
    }

    public boolean removeModel(Model model) {
        return models.remove(model);
    }

    public boolean containsModel(Model model) {
        return models.contains(model);
    }

    public Model getModel(int id) {
        return models.get(id);
    }

}
