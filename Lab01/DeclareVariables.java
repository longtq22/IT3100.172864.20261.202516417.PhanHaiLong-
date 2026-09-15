public class DeclareVariables {
    public static void main(String[] args) {
        String title = "The Lion King";
        double cost = 19.95;
        int id = 1;
        boolean isAvailable = true;

        System.out.println(title);
        System.out.println(cost);
        System.out.println(id);
        System.out.println(isAvailable);

        // Narrowing cast: double -> int
        int roundedCost = (int) cost;
        System.out.println(roundedCost);
    }
}

/* 
 * TRẢ LỜI CÂU HỎI BÀI 4.1:
 * 1. Giá trị in ra của roundedCost: 19
 * 2. Đây là phép CẮT BỎ phần thập phân, không phải làm tròn.
 * 3. Giải thích: Phép ép kiểu từ double sang int trong Java 
 *    sẽ tự động loại bỏ phần thập phân phía sau mà không áp dụng quy tắc làm tròn.
 */