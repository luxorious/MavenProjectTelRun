package lessons.lesson8.listDemo;

import java.util.List;

public class ListOperationDemo {

//    1 - створити список 10 елем.
//    2 - додати в початок і в кінець по одному елементую
//    3 - видалити елемент який задовільняє умову
//    4 - створити 2 дублікати колекції
//    5 - відсортувати 2 дублікати по збальгенню та зменшенню.
//
//    1
//     - отримання від користувача або з іншого джерела розміру нашої колекціі
//     - створення колекції.
//     - наповнення
//          - отримання даних для запоанення колекціїї
//          - перевірка відповідності данихю,
//     - додавання елементів у
//          - початок
//          - кінець
//    - пошук елемента який задовільняє умову
//    - і видалення елементів із колекції
//
//    - створення дубліката один і два
//    - сортування дублікатів

    public static void main(String[] args) {

        CollectionsUtil collectionsUtil = new CollectionsUtil();
        InputData inputData = new InputData();
        OutData outData = new OutData();


        int sizeOfOurCollections = inputData.inputNumberOfElements();

        List<Book> ourLibrary = collectionsUtil.createCollection();
        collectionsUtil.fillCollection(ourLibrary, sizeOfOurCollections, inputData, false);

        outData.printOurCollection(ourLibrary);

        collectionsUtil.fillCollection(ourLibrary, 1, inputData,true);
        collectionsUtil.fillCollection(ourLibrary, 1, inputData,false);

        System.out.println("-------------------------");
        outData.printOurCollection(ourLibrary);



    }
}
