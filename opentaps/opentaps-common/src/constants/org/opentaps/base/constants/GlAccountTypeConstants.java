package org.opentaps.base.constants;

/*
 * Copyright (c) Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA CHANGE

/**
 * GlAccountType constant values.
 */
public final class GlAccountTypeConstants {

    private GlAccountTypeConstants() { }

    /** Accounts Payable. */
    public static final String ACCOUNTS_PAYABLE = "ACCOUNTS_PAYABLE";
    public static final class AccountsReceivable {
        private AccountsReceivable() { }
        /** Accounts Receivable. */
        public static final String ACCOUNTS_RECEIVABLE = "ACCOUNTS_RECEIVABLE";
        /** Interest Income Receivables. */
        public static final String INTRSTINC_RECEIVABLE = "INTRSTINC_RECEIVABLE";
        /** Merchant Account Settlement. */
        public static final String MRCH_STLMNT_ACCOUNT = "MRCH_STLMNT_ACCOUNT";
    }
    public static final class Adjustment {
        private Adjustment() { }
        /** Accounts Payable Adjustment. */
        public static final String ACCTPAY_ADJUST = "ACCTPAY_ADJUST";
        /** Accounts Receivable Adjustment. */
        public static final String ACCTRECV_ADJUST = "ACCTRECV_ADJUST";
        /** Revenue. */
        public static final String ADJUSTMENT = "ADJUSTMENT";
    }
    /** Asset. */
    public static final String ASSET = "ASSET";
    /** Balance. */
    public static final String BALANCE_ACCOUNT = "BALANCE_ACCOUNT";
    /** Bank Settlement. */
    public static final String BANK_STLMNT_ACCOUNT = "BANK_STLMNT_ACCOUNT";
    public static final class Cogs {
        private Cogs() { }
        /** COGS Average Cost Adjustment. */
        public static final String COGS_ADJ_AVG_COST = "COGS_ADJ_AVG_COST";
    }
    /** Cost of Goods Sold. */
    public static final String COGS_ACCOUNT = "COGS_ACCOUNT";
    /** Credit Card. */
    public static final String CREDIT_CARD = "CREDIT_CARD";
    public static final class CurrentAsset {
        private CurrentAsset() { }
        /** Current Asset. */
        public static final String CURRENT_ASSET = "CURRENT_ASSET";
        /** Receivable from Inventory Transferred Out. */
        public static final String INVENTORY_XFER_OUT = "INVENTORY_XFER_OUT";
        /** Prepaid Expenses. */
        public static final String PREPAID_EXPENSES = "PREPAID_EXPENSES";
    }
    public static final class CurrentLiability {
        private CurrentLiability() { }
        /** Commissions Payables. */
        public static final String COMMISSIONS_PAYABLE = "COMMISSIONS_PAYABLE";
        /** Current Liability. */
        public static final String CURRENT_LIABILITY = "CURRENT_LIABILITY";
        /** Customer Credits. */
        public static final String CUSTOMER_CREDIT = "CUSTOMER_CREDIT";
        /** Customer Deposits. */
        public static final String CUSTOMER_DEPOSIT = "CUSTOMER_DEPOSIT";
        /** Customer Gift Certificate Balances. */
        public static final String CUSTOMER_GC_DEPOSIT = "CUSTOMER_GC_DEPOSIT";
        /** Payable from Inventory Transferred In. */
        public static final String INVENTORY_XFER_IN = "INVENTORY_XFER_IN";
        /** Uninvoiced Shipment Receipts. */
        public static final String UNINVOICED_SHIP_RCPT = "UNINVOICED_SHIP_RCPT";
    }
    /** Customer. */
    public static final String CUSTOMER_ACCOUNT = "CUSTOMER_ACCOUNT";
    /** Discounts. */
    public static final String DISCOUNTS_ACCOUNT = "DISCOUNTS_ACCOUNT";
    /** Due From Vendor. */
    public static final String DUE_FROM_VENDOR = "DUE_FROM_VENDOR";
    /** Equity. */
    public static final String EQUITY = "EQUITY";
    public static final class Expense {
        private Expense() { }
        /** Cost of Goods Sold. */
        public static final String COGS = "COGS";
        /** Expense. */
        public static final String EXPENSE = "EXPENSE";
        /** Operating Expense. */
        public static final String OPERATING_EXPENSE = "OPERATING_EXPENSE";
        /** Other Expense. */
        public static final String OTHER_EXPENSE = "OTHER_EXPENSE";
        /** Tax Expense. */
        public static final String TAX_EXPENSE = "TAX_EXPENSE";
    }
    /** Fixed Asset. */
    public static final String FIXED_ASSET = "FIXED_ASSET";
    /** Fixed Asset Maintenance. */
    public static final String FIXED_ASSET_MAINT = "FIXED_ASSET_MAINT";
    public static final class FxGainLossAcct {
        private FxGainLossAcct() { }
        /** Foreign Exchange Gain. */
        public static final String FX_GAIN_ACCOUNT = "FX_GAIN_ACCOUNT";
        /** Foreign Exchange Loss. */
        public static final String FX_LOSS_ACCOUNT = "FX_LOSS_ACCOUNT";
    }
    public static final class Income {
        private Income() { }
        /** Income. */
        public static final String INCOME = "INCOME";
        /** Other Income. */
        public static final String OTHER_INCOME = "OTHER_INCOME";
        /** Revenue. */
        public static final String REVENUE = "REVENUE";
    }
    /** Inventory Item Value Adjustment. */
    public static final String INV_ADJ_VAL = "INV_ADJ_VAL";
    /** Inventory Change. */
    public static final String INV_CHANGE_ACCOUNT = "INV_CHANGE_ACCOUNT";
    public static final class InventoryAccount {
        private InventoryAccount() { }
        /** Inventory. */
        public static final String INVENTORY_ACCOUNT = "INVENTORY_ACCOUNT";
        /** Inventory Adjustment from Average Cost. */
        public static final String INV_ADJ_AVG_COST = "INV_ADJ_AVG_COST";
    }
    /** Inventory Valuation Adjustment. */
    public static final String INVENTORY_VAL_ADJ = "INVENTORY_VAL_ADJ";
    /** Liability. */
    public static final String LIABILITY = "LIABILITY";
    /** Lockbox Cash Discount. */
    public static final String LOCKBOX_CASH_DISC = "LOCKBOX_CASH_DISC";
    /** Long Term Liability. */
    public static final String LONG_TERM_LIABILITY = "LONG_TERM_LIABILITY";
    public static final class MfgExpense {
        private MfgExpense() { }
        /** Contract Manufacturing Expense. */
        public static final String MFG_EXPENSE_CONTRACT = "MFG_EXPENSE_CONTRACT";
        /** Internal Manufacturing Expense. */
        public static final String MFG_EXPENSE_INTERNAL = "MFG_EXPENSE_INTERNAL";
        /** Expense for Reverted Production Runs. */
        public static final String MFG_EXPENSE_REVPRUN = "MFG_EXPENSE_REVPRUN";
        /** Scrapped Raw Materials Expense. */
        public static final String MFG_EXPENSE_SCRAP = "MFG_EXPENSE_SCRAP";
        /** Manufacturing Expense Variance. */
        public static final String MFG_EXPENSE_VARIANCE = "MFG_EXPENSE_VARIANCE";
    }
    public static final class OperatingExpense {
        private OperatingExpense() { }
        /** Commission Expense. */
        public static final String COMMISSION_EXPENSE = "COMMISSION_EXPENSE";
        /** Manufacturing Expense. */
        public static final String MFG_EXPENSE = "MFG_EXPENSE";
        /** Tax Expense. */
        public static final String PURCHASE_PRICE_VAR = "PURCHASE_PRICE_VAR";
        /** Salary Expenses. */
        public static final String SALARY_EXPENSES = "SALARY_EXPENSES";
    }
    /** Other Asset. */
    public static final String OTHER_ASSET = "OTHER_ASSET";
    public static final class OtherExpense {
        private OtherExpense() { }
        /** Foreign Exchange Gain/Loss. */
        public static final String FX_GAIN_LOSS_ACCT = "FX_GAIN_LOSS_ACCT";
        /** Write Off. */
        public static final String WRITEOFF = "WRITEOFF";
    }
    public static final class OtherIncome {
        private OtherIncome() { }
        /** Interest Income. */
        public static final String INTEREST_INCOME = "INTEREST_INCOME";
    }
    /** Owner's Equity. */
    public static final String OWNERS_EQUITY = "OWNERS_EQUITY";
    /** Parent Sub Account Reconciliation. */
    public static final String PARENT_SUB_BAL_ACCT = "PARENT_SUB_BAL_ACCT";
    /** Product. */
    public static final String PRODUCT_ACCOUNT = "PRODUCT_ACCOUNT";
    /** Profit Loss. */
    public static final String PROFIT_LOSS_ACCOUNT = "PROFIT_LOSS_ACCOUNT";
    /** Purchase. */
    public static final String PURCHASE_ACCOUNT = "PURCHASE_ACCOUNT";
    /** Raw Materials Inventory. */
    public static final String RAWMAT_INVENTORY = "RAWMAT_INVENTORY";
    /** Retained Earnings. */
    public static final String RETAINED_EARNINGS = "RETAINED_EARNINGS";
    /** Sales. */
    public static final String SALES_ACCOUNT = "SALES_ACCOUNT";
    /** Customer Returns. */
    public static final String SALES_RETURNS = "SALES_RETURNS";
    /** Supplier. */
    public static final String SUPPLIER_ACCOUNT = "SUPPLIER_ACCOUNT";
    /** Tax. */
    public static final String TAX_ACCOUNT = "TAX_ACCOUNT";
    /** Undeposited Receipts. */
    public static final String UNDEPOSITED_RECEIPTS = "UNDEPOSITED_RECEIPTS";
    /** Work In Progress Inventory. */
    public static final String WIP_INVENTORY = "WIP_INVENTORY";
    public static final class Writeoff {
        private Writeoff() { }
        /** Accounts Payables Write Off. */
        public static final String ACCTPAY_WRITEOFF = "ACCTPAY_WRITEOFF";
        /** Accounts Receivables Write Off. */
        public static final String ACCTRECV_WRITEOFF = "ACCTRECV_WRITEOFF";
        /** Commissions Payables Write Off. */
        public static final String COMMISSIONS_WRITEOFF = "COMMISSIONS_WRITEOFF";
        /** Interest Income Write Off. */
        public static final String INTRSTINC_WRITEOFF = "INTRSTINC_WRITEOFF";
    }

}
