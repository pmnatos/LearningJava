package AbstractDataTypeExample;

import java.util.ArrayList;
import java.util.List;

public class ObjectManagementImpl<T> implements ObjectManagement<T> {
    private List<T> objectList;

    ObjectManagementImpl(){
        objectList = new ArrayList<>();
    }

    @Override
    public void add(T e) {
     this.objectList.add(e);
    }

    @Override
    public void addAll(List<T> e) {
        this.objectList.addAll(e);
    }

    @Override
    public Integer getCount() {
        return objectList.size();
    }

    @Override
    public List<T> getAllObjectDetails() {
        return objectList.size() !=0? objectList:new ArrayList<>();
    }
}
