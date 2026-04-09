package com.restaurant.session4.Bai3;

//Phân tích
//*Cách A: /bai3/orders/5
//-Số 5 nằm trong Path (đường dẫn URL)
//-Cụ thể: /orders/{id} → id = 5
//-Dùng: @PathVariable
//-Ý nghĩa:
//+Đại diện cho tài nguyên cụ thể
//+URL mang tính RESTful rõ ràng: /orders/5 = đơn hàng số 5
//*Cách B: /bai3/orders?id=5
//-Số 5 nằm trong Query String (tham số sau dấu ?)
//-Dùng: @RequestParam
//-Ý nghĩa:
//+Thường dùng cho lọc / tìm kiếm / tùy chọn
//+Ví dụ: /orders?status=done

package com.restaurant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @GetMapping("/bai3/orders/{id}")
    public String getOrderById(@PathVariable Long id) {
        return "Chi tiết đơn hàng số " + id;
    }
}
