package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles.task6Goods;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EditGoods {
    private UserInput userInput;
    private final String PATH = "src/homeworks/additionalHomeWorks/chatGPTTasks/workWithFiles/sources/goods.txt";

    private void append(String nameOfGoods, int price, int quantity){
        try (FileWriter add = new FileWriter(PATH)) {
            add.write(nameOfGoods + " " + price + " " + quantity);
            System.out.println("goods " + nameOfGoods + " added");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    Напишіть програму, яка зберігає у файлі список товарів, їх цін та кількість,
//    а потім дозволяє користувачу додавати нові товари та редагувати наявні.
    public void edit(Goods good) throws IOException {

        try(RandomAccessFile file = new RandomAccessFile(PATH, "rw")){
            String line = null;
            long pointer = 0;

            if (file.readLine().equals(good.toString())){
                userInput.inputGood();

            }
        }
    }


//    public void edit(String nameOfGoods, int price, int quantity) throws IOException {
//        String strForSearch = nameOfGoods + " " + price + " " + quantity;
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))){
//            String line = reader.readLine();
//            while (line != null){
//                List<String> lineList = List.of(line.split(" "));
//                System.out.println(lineList);
//                if (nameOfGoods.equals(lineList.get(0))){
//
//                }
//                line = reader.readLine();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
