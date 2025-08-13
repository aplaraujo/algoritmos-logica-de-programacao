import { Order } from "./entities/Order.entity";
import { OrderStatus } from "./entities/OrderStatus.enum";

const order:Order = new Order(100, new Date(), OrderStatus.DELIVERED);
const os1:OrderStatus = OrderStatus.DELIVERED;
console.log(order);
console.log(os1);
