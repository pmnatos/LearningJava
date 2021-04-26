package AbstractDataTypeExample;

import java.util.List;

public interface ObjectManagement<T> {
    /**
     * Method to add a new Object
     * @param e
     */
    void add(T e);

    /**
     * Method to add a new list of Objects
     * @param e
     */
    void addAll(List<T> e);

    /**
     *
     * @return The count of the number of objects
     */
    Integer getCount();

    /**
     *
     * @return The list of all the Objects if list is not empty. Else returns an empty list.
     */
    List<T> getAllObjectDetails();
}
