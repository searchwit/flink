protected String[] wireTxnFieldNames = {"APP_SRC_CODE",
"ORIG_SYS_SRC_CODE",
"RESP_CENTER",
"ACCT_NUMBER",
"TXN_VALUE_DATE",
"TXN_POST_DATE",
"TXN_CODE",
"TXN_TYPE",
"CONV_TXN_AMT",
"CONV_POST_AMT",
"REF_NUMBER",
"BRANCH_ATM_NUMBER",
"TELLER_ATM_NUMBER",
"CHECK_NUMBER",
"NUMBER_OF_CHECKS",
"TYPE_IND",
"TXN_AMT",
"CASH_AMT",
"TXN_CURR_CODE",
"EXCHANGE_RATE",
"OVERSEAS_IND",
"REM_BEN_ACCT_NUMBER",
"REM_BEN_ACCT_NAME",
"TXN_DESC",
"ORIG_FLD_OPT",
"ORIGINATOR",
"ORIG_BANK_FLD_OPT",
"ORIG_BANK",
"SEND_BANK_FLD_OPT",
"SEND_BANK",
"BENE_BANK_FLD_OPT",
"BENE_BANK",
"BENE_FLD_OPT",
"BENEFICIARY",
"INTER_FLD_OPT",
"INTER_BANK",
"TRD_REIMB_FLD_OPT",
"TRD_REIMB_BANK",
"CRED_PTY_SENDER_OPT",
"CRED_PTY_SENDER",
"RECV_CORR_FLD_OPT",
"RECEIVER_CORR",
"PAYMENT_TYPE",
"BANK_TO_BANK_CODE",
"PAYMENT_DETAIL",
"SEND_BANK_CTY_CODE",
"ORIG_BANK_CTY_CODE",
"BENE_CTY_CODE",
"BENE_BANK_CTY_CODE",
"ORIG_CTY_CODE",
"INTER_BANK_CTY_CODE",
"PAYMENT_DETAIL_OPT",
"PAYMENT_DETAIL_CC",
"TRD_REIMB_CC",
"CREDIT_PTY_SENDER_CC",
"RECEIVER_CORR_CC",
"ORIG_CITY",
"ORIG_STATE",
"ORIG_POST_CODE",
"ORIG_BANK_CITY",
"ORIG_BANK_STATE",
"ORIG_BANK_POST_CODE",
"BENE_CITY",
"BENE_STATE",
"BENE_POST_CODE",
"BENE_BANK_CITY",
"BENE_BANK_STATE",
"BENE_BANK_POST_CODE",
"SEND_BANK_CITY",
"SEND_BANK_STATE",
"SEND_BANK_POST_CODE",
"INTER_BANK_CITY",
"INTER_BANK_STATE",
"INTER_BANK_POST_CODE",
"PAYMENT_BANK_CITY",
"PAYMENT_BANK_STATE",
"PAYMENT_BANK_POST_CODE",
"TRD_REIMB_BANK_CITY",
"TRD_REIMB_BANK_STATE",
"TRD_REIMB_BANK_POST_CODE",
"CRED_PTY_BANK_CITY",
"CRED_PTY_BANK_STATE",
"CRED_PTY_BANK_POST_CODE",
"RECV_CORR_BANK_CITY",
"RECV_CORR_BANK_STATE",
"RECV_CORR_BANK_POST_CODE",
"SENDER_REF_NO",
"RELATED_REF_NO",
"CHIP_FED_REF_NO",
"IS_ORIG_RECV_BANK",
"ISO_CTY_CODE",
"FILLER"
};
protected WireTxn readRSWireTxn(ResultSet result)
throws SQLException
{
WireTxn base = new WireTxn();
base.initAppSrcCode(result.getString(1));
base.initOrigSysSrcCode(result.getString(2));
base.initRespCenter(result.getString(3));
base.initAcctNumber(result.getString(4));
base.initTxnValueDate(result.getString(5));
base.initTxnPostDate(result.getString(6));
base.initTxnCode(result.getString(7));
base.initTxnType(result.getString(8));
base.initConvTxnAmt(result.getInt(9));
base.initConvPostAmt(result.getInt(10));
base.initRefNumber(result.getString(11));
base.initBranchAtmNumber(result.getString(12));
base.initTellerAtmNumber(result.getString(13));
base.initCheckNumber(result.getString(14));
base.initNumberOfChecks(result.getInt(15));
base.initTypeInd(result.getString(16));
base.initTxnAmt(result.getInt(17));
base.initCashAmt(result.getInt(18));
base.initTxnCurrCode(result.getString(19));
base.initExchangeRate(result.getInt(20));
base.initOverseasInd(result.getString(21));
base.initRemBenAcctNumber(result.getString(22));
base.initRemBenAcctName(result.getString(23));
base.initTxnDesc(result.getString(24));
base.initOrigFldOpt(result.getString(25));
base.initOriginator(result.getString(26));
base.initOrigBankFldOpt(result.getString(27));
base.initOrigBank(result.getString(28));
base.initSendBankFldOpt(result.getString(29));
base.initSendBank(result.getString(30));
base.initBeneBankFldOpt(result.getString(31));
base.initBeneBank(result.getString(32));
base.initBeneFldOpt(result.getString(33));
base.initBeneficiary(result.getString(34));
base.initInterFldOpt(result.getString(35));
base.initInterBank(result.getString(36));
base.initTrdReimbFldOpt(result.getString(37));
base.initTrdReimbBank(result.getString(38));
base.initCredPtySenderOpt(result.getString(39));
base.initCredPtySender(result.getString(40));
base.initRecvCorrFldOpt(result.getString(41));
base.initReceiverCorr(result.getString(42));
base.initPaymentType(result.getString(43));
base.initBankToBankCode(result.getString(44));
base.initPaymentDetail(result.getString(45));
base.initSendBankCtyCode(result.getString(46));
base.initOrigBankCtyCode(result.getString(47));
base.initBeneCtyCode(result.getString(48));
base.initBeneBankCtyCode(result.getString(49));
base.initOrigCtyCode(result.getString(50));
base.initInterBankCtyCode(result.getString(51));
base.initPaymentDetailOpt(result.getString(52));
base.initPaymentDetailCc(result.getString(53));
base.initTrdReimbCc(result.getString(54));
base.initCreditPtySenderCc(result.getString(55));
base.initReceiverCorrCc(result.getString(56));
base.initOrigCity(result.getString(57));
base.initOrigState(result.getString(58));
base.initOrigPostCode(result.getString(59));
base.initOrigBankCity(result.getString(60));
base.initOrigBankState(result.getString(61));
base.initOrigBankPostCode(result.getString(62));
base.initBeneCity(result.getString(63));
base.initBeneState(result.getString(64));
base.initBenePostCode(result.getString(65));
base.initBeneBankCity(result.getString(66));
base.initBeneBankState(result.getString(67));
base.initBeneBankPostCode(result.getString(68));
base.initSendBankCity(result.getString(69));
base.initSendBankState(result.getString(70));
base.initSendBankPostCode(result.getString(71));
base.initInterBankCity(result.getString(72));
base.initInterBankState(result.getString(73));
base.initInterBankPostCode(result.getString(74));
base.initPaymentBankCity(result.getString(75));
base.initPaymentBankState(result.getString(76));
base.initPaymentBankPostCode(result.getString(77));
base.initTrdReimbBankCity(result.getString(78));
base.initTrdReimbBankState(result.getString(79));
base.initTrdReimbBankPostCode(result.getString(80));
base.initCredPtyBankCity(result.getString(81));
base.initCredPtyBankState(result.getString(82));
base.initCredPtyBankPostCode(result.getString(83));
base.initRecvCorrBankCity(result.getString(84));
base.initRecvCorrBankState(result.getString(85));
base.initRecvCorrBankPostCode(result.getString(86));
base.initSenderRefNo(result.getString(87));
base.initRelatedRefNo(result.getString(88));
base.initChipFedRefNo(result.getString(89));
base.initOrigRecvBank(result.getString(90));
base.initIsoCtyCode(result.getString(91));
base.initFiller(result.getString(92));
return base;
}
 @Override
    public Map<String, WireTxn> getWireTxnMap(String reportKey)
    {
        StringBuilder sql = new StringBuilder();
        final Map<String, WireTxn> baseMap = new HashMap<>();

        sql.append("SELECT ").append(fieldList(wireTxnFieldNames, "rf"));
        sql.append(" FROM WIRE_TXN rf ");
        sql.append(" where REPORT_KEY = ? ");

        Object[] values = {reportKey};

        this.sqlService.dbRead(sql.toString(), values, new SqlReader()
        {
            public Object readSqlResultRecord(ResultSet result)
            {
                try {
                    WireTxn base = readRSWireTxn(result);
                    baseMap.put(base.getUid(), base);
                    return null;
                }
                catch (SQLException e) {
                    LOG.warn(e, "getWireTxnMap: ");
                    return null;
                }
            }
        });

        return baseMap;
    }
@Override
    public Map<String, WireTxn> getWireTxnMapByProcessDate(String processDate)
    {
        StringBuilder sql = new StringBuilder();
        final Map<String, WireTxn> baseMap = new HashMap<>();

        sql.append("SELECT ").append(fieldList(wireTxnFieldNames, "rf"));
        sql.append(" FROM WIRE_TXN rf ");
        sql.append(" where  in ( SELECT  FROM PRJ_TRANSACTIONS  ");
        sql.append(" where TRANSACTION_date_time  >= to_date(?, 'YYYYMMDD')  ");
        sql.append(" and TRANSACTION_date_time  < to_date(?, 'YYYYMMDD') +1 )  ");

        Object[] values = {processDate, processDate};

        this.sqlService.dbRead(sql.toString(), values, new SqlReader()
        {
            public Object readSqlResultRecord(ResultSet result)
            {
                try {
                    WireTxn base = readRSWireTxn(result);
                    baseMap.put(base.getUid(), base);
                    return null;
                }
                catch (SQLException e) {
                    LOG.warn(e, "getWireTxnMap: ");
                    return null;
                }
            }
        });

        return baseMap;
    }
  @Override
    public void saveWireTxn(WireTxn base)
    {
        final WireTxn impl = base;
        this.sqlService.transact(new Runnable()
        {
            public void run()
            {
                saveWireTxnTx(impl);
            }
        }, "saveWireTxn:" + base.getUid());
    }

    protected void saveWireTxnTx(WireTxn impl)
    {
        StringBuilder sql = new StringBuilder();

        int num = impl.getChanges().keySet().size();

        if (num <= 0) {
            LOG.info("no changes on WireTxn, do nothing, this should not happend");
        }
        else {
            if (impl.getStatus() != null && impl.getStatus().equalsIgnoreCase(STATUS_DELETED)) {
                //do deleted
                Object[] fields = new Object[1];
                fields[0] = (impl.getUid());
                String statement = "DELETE WIRE_TXN  where  ";

                if (!this.sqlService.dbWrite(statement, fields)) {
                    throw new RuntimeException("saveWireTxnTx - delete: dbWrite failed");
                }
            }
            //do insert
            else if (impl.getStatus() != null && impl.getStatus().equalsIgnoreCase(STATUS_CREATED)) {

                Long reportId = this.sqlService.getNextSequence("PRF_REPORT_SEQ", null);
                impl.setReportKey("02-" + reportId);

                String[] fn = new String[num];
                Object[] fields = new Object[num];

                int i = 0;
                for (Iterator<String> it = impl.getChanges().keySet().iterator(); it.hasNext(); ) {
                    fn[i] = it.next();
                    fields[i] = impl.getChanges().get(fn[i])[1];
                    i++;
                }


                sql.append("INSERT INTO WIRE_TXN ( ");
                sql.append(fieldList(fn));

                sql.append(" )" + " values ( ");

                sql.append(fieldsParams(fn)).append(" )");

//                Long rv = this.sqlService.dbInsert(null, sql.toString(), fields, "USER_INTERNAL_ID");
//                impl.initUserInternalId(rv.intValue());

                if (!this.sqlService.dbWrite(null, sql.toString(), fields)) {
                    throw new RuntimeException("saveWireTxnTx: insert - dbWrite failed" + impl.getUid());
                }
            }
            //do update
            else {
                String[] fn = new String[num];
                Object[] fields = new Object[num + 1];

                int i = 0;
                for (Iterator<String> it = impl.getChanges().keySet().iterator(); it.hasNext(); ) {
                    fn[i] = it.next();
                    fields[i] = impl.getChanges().get(fn[i])[1];
                    i++;
                }


                fields[num] = impl.getUid();

                sql.append("UPDATE WIRE_TXN SET ");
                sql.append(updateSet(fn));

                sql.append(" WHERE  ");

                //      LOG.warn("updated sql=" + sql);

                if (!this.sqlService.dbWrite(sql.toString(), fields)) {
                    throw new RuntimeException("saveWireTxnTx: update db write failed" + impl.getUid());
                }
            }

            //save History
            Date now = new Date();

            for (Iterator<String> it = impl.getChanges().keySet().iterator(); it.hasNext(); ) {
                String fname = it.next();
                //      String[] tmp = impl.getChanges().get(fname);
                Object fvalue = impl.getChanges().get(fname)[1];
                //field name + new value
                savePrfEntityHistory("WIRE_TXN", impl.getUid(), fname,
                        BATCH_ADMIN_ID, now, fvalue);
            }
        }
}

