package cn.codemao;

public class EnumTest {
    public static void main(String[] args) {
        OrderState state = OrderState.PAYMENT_PENDING;
        System.out.println(state.getName());

        switch (state) {
            case PAYMENT_PENDING:
                System.out.println("待支付~");
                break;
            case PROCESSING:
                System.out.println("处理中~");
                break;
            case SHIPPED:
                System.out.println("已发货~");
                break;
            case OUT_FOR_DELIVERY:
                System.out.println("配送中~");
                break;
            case DELIVERED:
                System.out.println("已送达~");
        }

        OrderState[] arr = OrderState.values();
        for (OrderState orderState : arr) {
            System.out.println(orderState);
        }

        OrderState shipped = OrderState.valueOf("SHIPPED");
        System.out.println(shipped);
    }
}
