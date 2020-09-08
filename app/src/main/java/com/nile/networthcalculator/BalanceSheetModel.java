package com.nile.networthcalculator;

import androidx.lifecycle.ViewModel;

public class BalanceSheetModel extends ViewModel {
    // Asset tables
    public double[] cash_entries = new double[6];
    public double[] invested_asset_entries = new double[16];
    public double[] use_asset_entries = new double[7];

    // Liability tables
    public double[] current_liabilities = new double[3];
    public double[] long_term_liabilities = new double[7];

    // Asset totals
    public double total_cash;
    public double total_invested_assets;
    public double total_use_assets;
    public double total_assets;

    // Total liabilities
    public double total_liabilites;

    public void updateAssets() {
        total_cash = 0;
        total_invested_assets = 0;
        total_use_assets = 0;
        total_assets = 0;

        for (double entry : cash_entries) {
            total_cash += entry;
        }

        for (double entry : invested_asset_entries) {
            total_invested_assets += entry;
        }

        for (double entry : use_asset_entries) {
            total_use_assets += entry;
        }

        total_assets = total_cash + total_invested_assets + total_use_assets;
    }

    public void updateLiabilities() {
        total_liabilites = 0;

        for (double entry : current_liabilities) {
            total_liabilites += entry;
        }

        for (double entry: long_term_liabilities) {
            total_liabilites += entry;
        }
    }
//    public BalanceSheetModel() {
//        // trigger asset load.
          // Perhaps this could load data from a database if necessary
//    }
}