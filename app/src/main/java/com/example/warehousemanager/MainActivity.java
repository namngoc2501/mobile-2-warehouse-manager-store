package com.example.warehousemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.warehousemanager.Category.Category;

public class MainActivity extends AppCompatActivity {
    ImageView imgXuatHang,imgNhapHang, imgThongKe,imgKhachHang, imgSanPham,imgLoaiSanPham, imgHangSanXuat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        setControll();
        setEvent();
    }
    private void setEvent() {
        imgXuatHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ExportActivity.class);
                startActivity(intent);
            }
        }); imgNhapHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ImportGoodsActivity.class);
                startActivity(intent);
            }
        }); imgKhachHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CustomerActivity.class);
                startActivity(intent);
            }
        }); imgThongKe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,StatisticsActivity.class);
                startActivity(intent);
            }
        }); imgSanPham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ProductActivity.class);
                startActivity(intent);
            }
        }); imgLoaiSanPham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProductCategory.class);
                startActivity(intent);
            }
        }); imgHangSanXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ManufacturerProduct.class);
                startActivity(intent);
            }
        });
    }
    private void setControll() {
        imgXuatHang = findViewById(R.id.imgExport);
        imgNhapHang = findViewById(R.id.imgImport);
        imgThongKe = findViewById(R.id.imgStatistics);
        imgKhachHang = findViewById(R.id.imgCustomer);
        imgLoaiSanPham = findViewById(R.id.imgCategory);
        imgHangSanXuat = findViewById(R.id.imgManufaturer);
        imgSanPham = findViewById(R.id.imgProduct);
    }
}