package com.example.reviseprojectt1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.reviseprojectt1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    String firstNumber = "0";
    String secondNumber = "0";
    String sign = "";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.clear.setOnClickListener(v->{
                firstNumber = "0";
                secondNumber = "0";
                sign = "";
                binding.mainscreen.setText("0");

        });

        binding.plus.setOnClickListener(v->{
            sign = "+";

        });

        binding.minus.setOnClickListener(view ->{
            sign = "-";
        });

        binding.divide.setOnClickListener(view -> {
            sign = "/";
        });

        binding.multiply.setOnClickListener(view -> {
            sign = "*";
        });


        binding.equal.setOnClickListener(view -> {

            if (sign.equals("+")) {

                int result = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
                binding.mainscreen.setText(String.valueOf(result));
                firstNumber = String.valueOf(result);
                secondNumber = "0";
                sign = "";

            } else if (sign.equals("-")) {

                int result = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);
                binding.mainscreen.setText(String.valueOf(result));
                firstNumber = String.valueOf(result);
                secondNumber = "0";
                sign = "";
            } else if (sign.equals("*")) {

                int result = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);
                binding.mainscreen.setText(String.valueOf(result));
                firstNumber = String.valueOf(result);
                secondNumber = "0";
                sign = "";
            } else if (sign.equals("/")) {

            double result = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
            binding.mainscreen.setText(String.valueOf(result));
                firstNumber = String.valueOf(result);
                secondNumber = "0";
                sign = "";}
        });


        binding.one.setOnClickListener(v -> {

            onClickNumbers("1");

//            if (firstNumber.equals("0")) {
//                firstNumber = "1";
//                binding.mainscreen.setText(firstNumber);
//            } else if (!firstNumber.equals("0") && sign.equals("")) {
//                firstNumber = firstNumber + 1;
//                binding.mainscreen.setText(firstNumber);
//            } else if (secondNumber.equals("0") && !sign.equals("")) {
//                secondNumber = "1";
//                binding.mainscreen.setText(secondNumber);
//            } else if (!secondNumber.equals("0") && !sign.equals("")) {
//                secondNumber = secondNumber + 1;
//                binding.mainscreen.setText(secondNumber);
//            }

        });

        binding.two.setOnClickListener(v -> {
            onClickNumbers("2");


        });

        binding.three.setOnClickListener(v->{
            onClickNumbers("3");
        });

        binding.four.setOnClickListener(v-> {

            onClickNumbers("4");
        });

        binding.five.setOnClickListener(v->{
            onClickNumbers("5");
        });

        binding.six.setOnClickListener(view -> {
            onClickNumbers("6");
        });

        binding.seven.setOnClickListener(view -> {
            onClickNumbers("7");
        });

        binding.eight.setOnClickListener(view -> {
            onClickNumbers("8");
        });

        binding.nine.setOnClickListener(view -> {
            onClickNumbers("9");
        });



    }

    public void onClickNumbers (String number){

        if (firstNumber.equals("0")) {
            firstNumber = number;
            binding.mainscreen.setText(firstNumber);
        } else if (!firstNumber.equals("0") && sign.equals("") ) {
            firstNumber = firstNumber + number;
            binding.mainscreen.setText(firstNumber);
        } else if (secondNumber.equals("0") && !sign.equals("")) {
            secondNumber = number;
            binding.mainscreen.setText(secondNumber);
        } else if (!secondNumber.equals("0") && !sign.equals("")) {
            secondNumber = secondNumber + number;
            binding.mainscreen.setText(secondNumber);
        }

    }
}