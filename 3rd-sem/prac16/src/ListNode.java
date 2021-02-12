public class ListNode {
    Drink drink;
    Dish dish;
    ListNode next;
    ListNode previous;

    ListNode(Drink drink) {
        this(null, drink, null);
    }

    ListNode(Dish dish) {
        this(null, dish, null);
    }

    ListNode(ListNode previous, Drink drink, ListNode next) {
        this.drink = drink;
        this.next = next;
        this.previous = previous;
    }

    ListNode(ListNode previous, Dish dish, ListNode next) {
        this.dish = dish;
        this.next = next;
        this.previous = previous;
    }
}
