package homeworks.additionalHomeWorks.OOP.interfaces.task8;

public class InMemoryDatabase implements ProductDatabase{
    private Product[] arr = new Product[0];


    @Override
    public void save(Product product) {
        Product[] newArr = new Product[this.arr.length + 1];
        System.arraycopy(this.arr, 0, newArr, 0, this.arr.length);
        newArr[newArr.length - 1] = product;
        this.arr = newArr;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : this.arr) {
            if (product.getTitle().equals(productTitle)) {
                System.out.println(product.getTitle()); // sout - for output example.
                return product;
            }
        }
        return null;
    }
}
