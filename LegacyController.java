package com.restaurant.session4.controller;

import com.restaurant.session4.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//Bài 1
@Controller
@RequestMapping("/bai1/orders")
public class LegacyController {
    private final OrderService orderService;

    @Autowired
    public LegacyController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    @ResponseBody
    public String getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    @PostMapping
    @ResponseBody
    public String createOrder() {
        return "Tao don hang thanh cong";
    }
    //Bài 2
    @GetMapping("/bai2/menu")
    public String getMenu(
            @RequestParam(name = "category", required = false, defaultValue = "chay") String category
    ) {
        switch (category.toLowerCase()) {
            case "lau":
                return "Menu Lẩu: Lẩu Thái, Lẩu Hải Sản, Lẩu Bò";
            case "nuong":
                return "Menu Nướng: Bò nướng, Gà nướng, Hải sản nướng";
            case "com":
                return "Menu Cơm: Cơm gà, Cơm sườn, Cơm chiên";
            case "chay":
            default:
                return "Menu Chay: Đậu hũ sốt cà, Rau xào, Canh rong biển";
        }
    }
}