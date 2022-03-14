package study.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

public class ModelView {
    // Model을 대체하면서, View 이름까지 전달하는 역할을 하는 직접 만든 객체
    private String viewName;
    private Map<String, Object> model = new HashMap<>();

    public ModelView(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public Map<String, Object> getModel() {
        return model;
    }

    public void setModel(Map<String, Object> model) {
        this.model = model;
    }
}
