package springbootonlyjava.Juuhyunn02.util;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
class Product {
    private final int productId;
    private final String description;
}
public class ObjectArray {
    public Product[] createCart() {
        Product[] cart = new Product[5];
        String[] productNames = {"Coffee", "Computer","Apple", "Dress", "Fairy-tale book"};
//        Product p1 = new Product(1, "Coffee");
//        Product p2 = new Product(2, "Computer");
//        Product p3 = new Product(3, "Apple");
//        Product p4 = new Product(4, "Dress");
//        Product p5 = new Product(5, "Fairy-tale book");
        for (int i = 0; i < cart.length; i++) {
            cart[i] = new Product( i+1 , productNames[i] );
        }
//        int j = 0;
//        for (Product i : cart) {
//            i = new Product(j+1, productNames[j]);
//            j ++ ;
//        } // j를 저장하여 다시 사용할 상황이 아니라면, 굳이 자원을 낭비하지 않고 스코프 안에서만 사용되고 제거되는게 낫다.
        return cart;
    }
}