//A class can have more than one type parameter. In this case, the type parameters are separated by a comma
public class GMultipleDataType <DataTypeOne, DataTypeTwo> {
    DataTypeOne valueOne;
    DataTypeTwo valueTwo;

    public GMultipleDataType(DataTypeOne v1, DataTypeTwo v2) {
        this.valueOne = v1;
        this.valueTwo = v2;
    }

    //getters and setters
    public DataTypeOne getValueOne() {
        return valueOne;
    }

    public void setValueOne(DataTypeOne valueOne) {
        this.valueOne = valueOne;
    }

    public DataTypeTwo getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(DataTypeTwo valueTwo) {
        this.valueTwo = valueTwo;
    }
}
