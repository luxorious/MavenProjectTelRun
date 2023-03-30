package homeworks.additionalHomeWorks.OOP.interfaces.task3;
//        Создаём интерфейс для структуры данных список.
//
//        Массив в Java это хорошая структура данных для хранения примитивных типов данных
//        или ссылок на объекты. Но у массива есть много ограничений. Например длинну массива
//        нельзя изменить после его создания.
//
//        В этом задании предлагается создать интерфейс для структуры данных список.
//        Структура данных список - это тот же массив, только без ограничений!
//        Придумайте каких операций вам не хватает в массиве. Для каждой операции
//        создайте свой метод в интерфейсе MyList и опишите словами, что этот метод должен
//        делать в коментарии к методу.
//
//        Не подсматривайте имплементацию java.util.List и тому подобных интерфейсов и классов.
//
//        Цель этого задания самостоятельно разработать свой интерфейс MyList.
public class Task3 implements MyList{
    private int[] array = new int[0];

    @Override
    public void changeByIndex(int index, int element) {
        array[index] = element;
    }

    @Override
    public void changeSize(int size) {
        int[] tmpArr = this.array;
        int[] arrTmp = new int[size];
        if(tmpArr.length < arrTmp.length){
            for (int i = 0; i < tmpArr.length; i++) {
                arrTmp[i] = tmpArr[i];
            }
        } else {
            System.arraycopy(tmpArr, 0, arrTmp, 0, arrTmp.length);
        }
        this.array = arrTmp;
    }

    @Override
    public void addAll(int... elems) {
        int len = this.array.length;
        int e = -1;
        changeSize(this.array.length + elems.length);
        for (int i = len; i < this.array.length; i++) {
            e++;
            this.array[i] = elems[e];
        }
    }

    @Override
    public void print(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1 ){
                System.out.println(array[i] + " ]");
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    @Override
    public void insertByIndex(int index, int... elems) {
        int[] spliceStart = new int[index];
        int[] spliceEnd = new int[this.array.length - index];

        for (int i = 0; i < spliceStart.length; i++) {
            spliceStart[i] = this.array[i];
        }

        for (int i = 0; i < spliceEnd.length; i++) {
            spliceEnd[i] = this.array[index + i];
        }
        changeSize(0);
        addAll(spliceStart);
        addAll(elems);
        addAll(spliceEnd);
    }
}
