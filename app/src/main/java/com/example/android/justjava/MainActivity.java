package com.example.android.justjava;

/**
 * Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 * <p>
 * package com.example.android.justjava;
 */

import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int quantity1 = 0, quantity2 = 0, quantity3 = 0;
    int orderTimes = 1;
    float sumPrice;

    public void increment1(View view) {
        quantity1 = quantity1 + 1;
        sumPrice = 32 * quantity1 + 38 * quantity2 + 44 * quantity3;
        display1(quantity1);
        displayPrice(sumPrice);
    }

    public void decrement1(View view) {
        if (quantity1 > 0) {
            quantity1 = quantity1 - 1;
            sumPrice = 32 * quantity1 + 38 * quantity2 + 44 * quantity3;
            display1(quantity1);
            displayPrice(sumPrice);
        }
    }

    public void increment2(View view) {
        quantity2 = quantity2 + 1;
        sumPrice = 32 * quantity1 + 38 * quantity2 + 44 * quantity3;
        display2(quantity2);
        displayPrice(sumPrice);
    }

    public void decrement2(View view) {
        if (quantity2 > 0) {
            quantity2 = quantity2 - 1;
            sumPrice = 32 * quantity1 + 38 * quantity2 + 44 * quantity3;
            display2(quantity2);
            displayPrice(sumPrice);
        }
    }

    public void increment3(View view) {
        quantity3 = quantity3 + 1;
        sumPrice = 32 * quantity1 + 38 * quantity2 + 44 * quantity3;
        display3(quantity3);
        displayPrice(sumPrice);
    }

    public void decrement3(View view) {
        if (quantity3 > 0) {
            quantity3 = quantity3 - 1;
            sumPrice = 32 * quantity1 + 38 * quantity2 + 44 * quantity3;
            display3(quantity3);
            displayPrice(sumPrice);
        }
    }

    public void commit(View view) {
        if (orderTimes % 2 != 0) {
            displayFinishOrderMessage("Thank you for buying our coffee!");
            orderTimes = orderTimes + 1;
        } else
            displayFinishOrderMessage("You have submitted your order. Please don't submitted again!");
        //if(orderTimes>2)orderTimes=1;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity1_text_view);
        quantityTextView.setText("" + number);
    }

    private void display2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity2_text_view);
        quantityTextView.setText("" + number);
    }

    private void display3(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity3_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(float number) {
        TextView priceTextView = (TextView) findViewById(R.id.price);
        priceTextView.setText("" + number);
    }

    private void displayFinishOrderMessage(String message) {
        TextView quantityTextView = (TextView) findViewById(R.id.finishOrder_text_view);
        quantityTextView.setText("" + message);
    }
}
