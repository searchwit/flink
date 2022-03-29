package test.ctrx.core.mdl;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import test.ctrx.core.BaseImpl;
import com.google.common.collect.ImmutableList;

import javax.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.math.BigDecimal;
import java.util.Objects;

import static com.google.common.base.MoreObjects.toStringHelper;
public class WireTxn extends BaseImpl
{
private String appSrcCode;
private String origSysSrcCode;
private String respCenter;
private String acctNumber;
private String txnValueDate;
private String txnPostDate;
private String txnCode;
private String txnType;
private Integer convTxnAmt;
private Integer convPostAmt;
private String refNumber;
private String branchAtmNumber;
private String tellerAtmNumber;
private String checkNumber;
private Integer numberOfChecks;
private String typeInd;
private Integer txnAmt;
private Integer cashAmt;
private String txnCurrCode;
private Integer exchangeRate;
private String overseasInd;
private String remBenAcctNumber;
private String remBenAcctName;
private String txnDesc;
private String origFldOpt;
private String originator;
private String origBankFldOpt;
private String origBank;
private String sendBankFldOpt;
private String sendBank;
private String beneBankFldOpt;
private String beneBank;
private String beneFldOpt;
private String beneficiary;
private String interFldOpt;
private String interBank;
private String trdReimbFldOpt;
private String trdReimbBank;
private String credPtySenderOpt;
private String credPtySender;
private String recvCorrFldOpt;
private String receiverCorr;
private String paymentType;
private String bankToBankCode;
private String paymentDetail;
private String sendBankCtyCode;
private String origBankCtyCode;
private String beneCtyCode;
private String beneBankCtyCode;
private String origCtyCode;
private String interBankCtyCode;
private String paymentDetailOpt;
private String paymentDetailCc;
private String trdReimbCc;
private String creditPtySenderCc;
private String receiverCorrCc;
private String origCity;
private String origState;
private String origPostCode;
private String origBankCity;
private String origBankState;
private String origBankPostCode;
private String beneCity;
private String beneState;
private String benePostCode;
private String beneBankCity;
private String beneBankState;
private String beneBankPostCode;
private String sendBankCity;
private String sendBankState;
private String sendBankPostCode;
private String interBankCity;
private String interBankState;
private String interBankPostCode;
private String paymentBankCity;
private String paymentBankState;
private String paymentBankPostCode;
private String trdReimbBankCity;
private String trdReimbBankState;
private String trdReimbBankPostCode;
private String credPtyBankCity;
private String credPtyBankState;
private String credPtyBankPostCode;
private String recvCorrBankCity;
private String recvCorrBankState;
private String recvCorrBankPostCode;
private String senderRefNo;
private String relatedRefNo;
private String chipFedRefNo;
private String isOrigRecvBank;
private String isoCtyCode;
private String filler;
public WireTxn()
{
super();
}

@Override
    public String getUid()
    {
        return String.valueOf( id );
    }
@JsonCreator 
public WireTxn(
@JsonProperty("appSrcCode") String appSrcCode,
@JsonProperty("origSysSrcCode") String origSysSrcCode,
@JsonProperty("respCenter") String respCenter,
@JsonProperty("acctNumber") String acctNumber,
@JsonProperty("txnValueDate") String txnValueDate,
@JsonProperty("txnPostDate") String txnPostDate,
@JsonProperty("txnCode") String txnCode,
@JsonProperty("txnType") String txnType,
@JsonProperty("convTxnAmt") Integer convTxnAmt,
@JsonProperty("convPostAmt") Integer convPostAmt,
@JsonProperty("refNumber") String refNumber,
@JsonProperty("branchAtmNumber") String branchAtmNumber,
@JsonProperty("tellerAtmNumber") String tellerAtmNumber,
@JsonProperty("checkNumber") String checkNumber,
@JsonProperty("numberOfChecks") Integer numberOfChecks,
@JsonProperty("typeInd") String typeInd,
@JsonProperty("txnAmt") Integer txnAmt,
@JsonProperty("cashAmt") Integer cashAmt,
@JsonProperty("txnCurrCode") String txnCurrCode,
@JsonProperty("exchangeRate") Integer exchangeRate,
@JsonProperty("overseasInd") String overseasInd,
@JsonProperty("remBenAcctNumber") String remBenAcctNumber,
@JsonProperty("remBenAcctName") String remBenAcctName,
@JsonProperty("txnDesc") String txnDesc,
@JsonProperty("origFldOpt") String origFldOpt,
@JsonProperty("originator") String originator,
@JsonProperty("origBankFldOpt") String origBankFldOpt,
@JsonProperty("origBank") String origBank,
@JsonProperty("sendBankFldOpt") String sendBankFldOpt,
@JsonProperty("sendBank") String sendBank,
@JsonProperty("beneBankFldOpt") String beneBankFldOpt,
@JsonProperty("beneBank") String beneBank,
@JsonProperty("beneFldOpt") String beneFldOpt,
@JsonProperty("beneficiary") String beneficiary,
@JsonProperty("interFldOpt") String interFldOpt,
@JsonProperty("interBank") String interBank,
@JsonProperty("trdReimbFldOpt") String trdReimbFldOpt,
@JsonProperty("trdReimbBank") String trdReimbBank,
@JsonProperty("credPtySenderOpt") String credPtySenderOpt,
@JsonProperty("credPtySender") String credPtySender,
@JsonProperty("recvCorrFldOpt") String recvCorrFldOpt,
@JsonProperty("receiverCorr") String receiverCorr,
@JsonProperty("paymentType") String paymentType,
@JsonProperty("bankToBankCode") String bankToBankCode,
@JsonProperty("paymentDetail") String paymentDetail,
@JsonProperty("sendBankCtyCode") String sendBankCtyCode,
@JsonProperty("origBankCtyCode") String origBankCtyCode,
@JsonProperty("beneCtyCode") String beneCtyCode,
@JsonProperty("beneBankCtyCode") String beneBankCtyCode,
@JsonProperty("origCtyCode") String origCtyCode,
@JsonProperty("interBankCtyCode") String interBankCtyCode,
@JsonProperty("paymentDetailOpt") String paymentDetailOpt,
@JsonProperty("paymentDetailCc") String paymentDetailCc,
@JsonProperty("trdReimbCc") String trdReimbCc,
@JsonProperty("creditPtySenderCc") String creditPtySenderCc,
@JsonProperty("receiverCorrCc") String receiverCorrCc,
@JsonProperty("origCity") String origCity,
@JsonProperty("origState") String origState,
@JsonProperty("origPostCode") String origPostCode,
@JsonProperty("origBankCity") String origBankCity,
@JsonProperty("origBankState") String origBankState,
@JsonProperty("origBankPostCode") String origBankPostCode,
@JsonProperty("beneCity") String beneCity,
@JsonProperty("beneState") String beneState,
@JsonProperty("benePostCode") String benePostCode,
@JsonProperty("beneBankCity") String beneBankCity,
@JsonProperty("beneBankState") String beneBankState,
@JsonProperty("beneBankPostCode") String beneBankPostCode,
@JsonProperty("sendBankCity") String sendBankCity,
@JsonProperty("sendBankState") String sendBankState,
@JsonProperty("sendBankPostCode") String sendBankPostCode,
@JsonProperty("interBankCity") String interBankCity,
@JsonProperty("interBankState") String interBankState,
@JsonProperty("interBankPostCode") String interBankPostCode,
@JsonProperty("paymentBankCity") String paymentBankCity,
@JsonProperty("paymentBankState") String paymentBankState,
@JsonProperty("paymentBankPostCode") String paymentBankPostCode,
@JsonProperty("trdReimbBankCity") String trdReimbBankCity,
@JsonProperty("trdReimbBankState") String trdReimbBankState,
@JsonProperty("trdReimbBankPostCode") String trdReimbBankPostCode,
@JsonProperty("credPtyBankCity") String credPtyBankCity,
@JsonProperty("credPtyBankState") String credPtyBankState,
@JsonProperty("credPtyBankPostCode") String credPtyBankPostCode,
@JsonProperty("recvCorrBankCity") String recvCorrBankCity,
@JsonProperty("recvCorrBankState") String recvCorrBankState,
@JsonProperty("recvCorrBankPostCode") String recvCorrBankPostCode,
@JsonProperty("senderRefNo") String senderRefNo,
@JsonProperty("relatedRefNo") String relatedRefNo,
@JsonProperty("chipFedRefNo") String chipFedRefNo,
@JsonProperty("isOrigRecvBank") String isOrigRecvBank,
@JsonProperty("isoCtyCode") String isoCtyCode,
@JsonProperty("filler") String filler,

        @JsonProperty("startRow") int startRow,
            @JsonProperty("pageSize") int pageSize,
            @JsonProperty("totalRow") long totalRow,
            @JsonProperty("uid") String uid,
            @JsonProperty("query") String query,
            @JsonProperty("sortField") String sortField,
            @JsonProperty("sortOrder") String sortOrder
)
{
super();

initAppSrcCode(appSrcCode);
initOrigSysSrcCode(origSysSrcCode);
initRespCenter(respCenter);
initAcctNumber(acctNumber);
initTxnValueDate(txnValueDate);
initTxnPostDate(txnPostDate);
initTxnCode(txnCode);
initTxnType(txnType);
initConvTxnAmt(convTxnAmt);
initConvPostAmt(convPostAmt);
initRefNumber(refNumber);
initBranchAtmNumber(branchAtmNumber);
initTellerAtmNumber(tellerAtmNumber);
initCheckNumber(checkNumber);
initNumberOfChecks(numberOfChecks);
initTypeInd(typeInd);
initTxnAmt(txnAmt);
initCashAmt(cashAmt);
initTxnCurrCode(txnCurrCode);
initExchangeRate(exchangeRate);
initOverseasInd(overseasInd);
initRemBenAcctNumber(remBenAcctNumber);
initRemBenAcctName(remBenAcctName);
initTxnDesc(txnDesc);
initOrigFldOpt(origFldOpt);
initOriginator(originator);
initOrigBankFldOpt(origBankFldOpt);
initOrigBank(origBank);
initSendBankFldOpt(sendBankFldOpt);
initSendBank(sendBank);
initBeneBankFldOpt(beneBankFldOpt);
initBeneBank(beneBank);
initBeneFldOpt(beneFldOpt);
initBeneficiary(beneficiary);
initInterFldOpt(interFldOpt);
initInterBank(interBank);
initTrdReimbFldOpt(trdReimbFldOpt);
initTrdReimbBank(trdReimbBank);
initCredPtySenderOpt(credPtySenderOpt);
initCredPtySender(credPtySender);
initRecvCorrFldOpt(recvCorrFldOpt);
initReceiverCorr(receiverCorr);
initPaymentType(paymentType);
initBankToBankCode(bankToBankCode);
initPaymentDetail(paymentDetail);
initSendBankCtyCode(sendBankCtyCode);
initOrigBankCtyCode(origBankCtyCode);
initBeneCtyCode(beneCtyCode);
initBeneBankCtyCode(beneBankCtyCode);
initOrigCtyCode(origCtyCode);
initInterBankCtyCode(interBankCtyCode);
initPaymentDetailOpt(paymentDetailOpt);
initPaymentDetailCc(paymentDetailCc);
initTrdReimbCc(trdReimbCc);
initCreditPtySenderCc(creditPtySenderCc);
initReceiverCorrCc(receiverCorrCc);
initOrigCity(origCity);
initOrigState(origState);
initOrigPostCode(origPostCode);
initOrigBankCity(origBankCity);
initOrigBankState(origBankState);
initOrigBankPostCode(origBankPostCode);
initBeneCity(beneCity);
initBeneState(beneState);
initBenePostCode(benePostCode);
initBeneBankCity(beneBankCity);
initBeneBankState(beneBankState);
initBeneBankPostCode(beneBankPostCode);
initSendBankCity(sendBankCity);
initSendBankState(sendBankState);
initSendBankPostCode(sendBankPostCode);
initInterBankCity(interBankCity);
initInterBankState(interBankState);
initInterBankPostCode(interBankPostCode);
initPaymentBankCity(paymentBankCity);
initPaymentBankState(paymentBankState);
initPaymentBankPostCode(paymentBankPostCode);
initTrdReimbBankCity(trdReimbBankCity);
initTrdReimbBankState(trdReimbBankState);
initTrdReimbBankPostCode(trdReimbBankPostCode);
initCredPtyBankCity(credPtyBankCity);
initCredPtyBankState(credPtyBankState);
initCredPtyBankPostCode(credPtyBankPostCode);
initRecvCorrBankCity(recvCorrBankCity);
initRecvCorrBankState(recvCorrBankState);
initRecvCorrBankPostCode(recvCorrBankPostCode);
initSenderRefNo(senderRefNo);
initRelatedRefNo(relatedRefNo);
initChipFedRefNo(chipFedRefNo);
initOrigRecvBank(isOrigRecvBank);
initIsoCtyCode(isoCtyCode);
initFiller(filler);

        setStartRow(startRow);
        setPageSize(pageSize);
        setTotalRow(totalRow);
        setUid(uid);
        setQuery(query);
        setSortField(sortField);
        setSortOrder(sortOrder);}

@JsonProperty("appSrcCode")
public String getAppSrcCode()
{
return appSrcCode;
}

public void initAppSrcCode(String appSrcCode)
{
this.appSrcCode=appSrcCode;
}

public void setAppSrcCode(String appSrcCode)
{
appSrcCode= Strings.emptyToNull(appSrcCode);
if (Objects.equals(this.appSrcCode, appSrcCode)) {
return;
}
changes.put("APP_SRC_CODE", new String[] {this.appSrcCode, appSrcCode});
this.appSrcCode=appSrcCode;
}
@JsonProperty("origSysSrcCode")
public String getOrigSysSrcCode()
{
return origSysSrcCode;
}

public void initOrigSysSrcCode(String origSysSrcCode)
{
this.origSysSrcCode=origSysSrcCode;
}

public void setOrigSysSrcCode(String origSysSrcCode)
{
origSysSrcCode= Strings.emptyToNull(origSysSrcCode);
if (Objects.equals(this.origSysSrcCode, origSysSrcCode)) {
return;
}
changes.put("ORIG_SYS_SRC_CODE", new String[] {this.origSysSrcCode, origSysSrcCode});
this.origSysSrcCode=origSysSrcCode;
}
@JsonProperty("respCenter")
public String getRespCenter()
{
return respCenter;
}

public void initRespCenter(String respCenter)
{
this.respCenter=respCenter;
}

public void setRespCenter(String respCenter)
{
respCenter= Strings.emptyToNull(respCenter);
if (Objects.equals(this.respCenter, respCenter)) {
return;
}
changes.put("RESP_CENTER", new String[] {this.respCenter, respCenter});
this.respCenter=respCenter;
}
@JsonProperty("acctNumber")
public String getAcctNumber()
{
return acctNumber;
}

public void initAcctNumber(String acctNumber)
{
this.acctNumber=acctNumber;
}

public void setAcctNumber(String acctNumber)
{
acctNumber= Strings.emptyToNull(acctNumber);
if (Objects.equals(this.acctNumber, acctNumber)) {
return;
}
changes.put("ACCT_NUMBER", new String[] {this.acctNumber, acctNumber});
this.acctNumber=acctNumber;
}
@JsonProperty("txnValueDate")
public String getTxnValueDate()
{
return txnValueDate;
}

public void initTxnValueDate(String txnValueDate)
{
this.txnValueDate=txnValueDate;
}

public void setTxnValueDate(String txnValueDate)
{
txnValueDate= Strings.emptyToNull(txnValueDate);
if (Objects.equals(this.txnValueDate, txnValueDate)) {
return;
}
changes.put("TXN_VALUE_DATE", new String[] {this.txnValueDate, txnValueDate});
this.txnValueDate=txnValueDate;
}
@JsonProperty("txnPostDate")
public String getTxnPostDate()
{
return txnPostDate;
}

public void initTxnPostDate(String txnPostDate)
{
this.txnPostDate=txnPostDate;
}

public void setTxnPostDate(String txnPostDate)
{
txnPostDate= Strings.emptyToNull(txnPostDate);
if (Objects.equals(this.txnPostDate, txnPostDate)) {
return;
}
changes.put("TXN_POST_DATE", new String[] {this.txnPostDate, txnPostDate});
this.txnPostDate=txnPostDate;
}
@JsonProperty("txnCode")
public String getTxnCode()
{
return txnCode;
}

public void initTxnCode(String txnCode)
{
this.txnCode=txnCode;
}

public void setTxnCode(String txnCode)
{
txnCode= Strings.emptyToNull(txnCode);
if (Objects.equals(this.txnCode, txnCode)) {
return;
}
changes.put("TXN_CODE", new String[] {this.txnCode, txnCode});
this.txnCode=txnCode;
}
@JsonProperty("txnType")
public String getTxnType()
{
return txnType;
}

public void initTxnType(String txnType)
{
this.txnType=txnType;
}

public void setTxnType(String txnType)
{
txnType= Strings.emptyToNull(txnType);
if (Objects.equals(this.txnType, txnType)) {
return;
}
changes.put("TXN_TYPE", new String[] {this.txnType, txnType});
this.txnType=txnType;
}
@JsonProperty("convTxnAmt")
public Integer getConvTxnAmt()
{
return convTxnAmt;
}

public void initConvTxnAmt(Integer convTxnAmt)
{
this.convTxnAmt=convTxnAmt;
}

public void setConvTxnAmt(Integer convTxnAmt)
{
if (Objects.equals(this.convTxnAmt, convTxnAmt)) {
return;
}
changes.put("CONV_TXN_AMT", new Integer[] {this.convTxnAmt, convTxnAmt});
this.convTxnAmt=convTxnAmt;
}
@JsonProperty("convPostAmt")
public Integer getConvPostAmt()
{
return convPostAmt;
}

public void initConvPostAmt(Integer convPostAmt)
{
this.convPostAmt=convPostAmt;
}

public void setConvPostAmt(Integer convPostAmt)
{
if (Objects.equals(this.convPostAmt, convPostAmt)) {
return;
}
changes.put("CONV_POST_AMT", new Integer[] {this.convPostAmt, convPostAmt});
this.convPostAmt=convPostAmt;
}
@JsonProperty("refNumber")
public String getRefNumber()
{
return refNumber;
}

public void initRefNumber(String refNumber)
{
this.refNumber=refNumber;
}

public void setRefNumber(String refNumber)
{
refNumber= Strings.emptyToNull(refNumber);
if (Objects.equals(this.refNumber, refNumber)) {
return;
}
changes.put("REF_NUMBER", new String[] {this.refNumber, refNumber});
this.refNumber=refNumber;
}
@JsonProperty("branchAtmNumber")
public String getBranchAtmNumber()
{
return branchAtmNumber;
}

public void initBranchAtmNumber(String branchAtmNumber)
{
this.branchAtmNumber=branchAtmNumber;
}

public void setBranchAtmNumber(String branchAtmNumber)
{
branchAtmNumber= Strings.emptyToNull(branchAtmNumber);
if (Objects.equals(this.branchAtmNumber, branchAtmNumber)) {
return;
}
changes.put("BRANCH_ATM_NUMBER", new String[] {this.branchAtmNumber, branchAtmNumber});
this.branchAtmNumber=branchAtmNumber;
}
@JsonProperty("tellerAtmNumber")
public String getTellerAtmNumber()
{
return tellerAtmNumber;
}

public void initTellerAtmNumber(String tellerAtmNumber)
{
this.tellerAtmNumber=tellerAtmNumber;
}

public void setTellerAtmNumber(String tellerAtmNumber)
{
tellerAtmNumber= Strings.emptyToNull(tellerAtmNumber);
if (Objects.equals(this.tellerAtmNumber, tellerAtmNumber)) {
return;
}
changes.put("TELLER_ATM_NUMBER", new String[] {this.tellerAtmNumber, tellerAtmNumber});
this.tellerAtmNumber=tellerAtmNumber;
}
@JsonProperty("checkNumber")
public String getCheckNumber()
{
return checkNumber;
}

public void initCheckNumber(String checkNumber)
{
this.checkNumber=checkNumber;
}

public void setCheckNumber(String checkNumber)
{
checkNumber= Strings.emptyToNull(checkNumber);
if (Objects.equals(this.checkNumber, checkNumber)) {
return;
}
changes.put("CHECK_NUMBER", new String[] {this.checkNumber, checkNumber});
this.checkNumber=checkNumber;
}
@JsonProperty("numberOfChecks")
public Integer getNumberOfChecks()
{
return numberOfChecks;
}

public void initNumberOfChecks(Integer numberOfChecks)
{
this.numberOfChecks=numberOfChecks;
}

public void setNumberOfChecks(Integer numberOfChecks)
{
if (Objects.equals(this.numberOfChecks, numberOfChecks)) {
return;
}
changes.put("NUMBER_OF_CHECKS", new Integer[] {this.numberOfChecks, numberOfChecks});
this.numberOfChecks=numberOfChecks;
}
@JsonProperty("typeInd")
public String getTypeInd()
{
return typeInd;
}

public void initTypeInd(String typeInd)
{
this.typeInd=typeInd;
}

public void setTypeInd(String typeInd)
{
typeInd= Strings.emptyToNull(typeInd);
if (Objects.equals(this.typeInd, typeInd)) {
return;
}
changes.put("TYPE_IND", new String[] {this.typeInd, typeInd});
this.typeInd=typeInd;
}
@JsonProperty("txnAmt")
public Integer getTxnAmt()
{
return txnAmt;
}

public void initTxnAmt(Integer txnAmt)
{
this.txnAmt=txnAmt;
}

public void setTxnAmt(Integer txnAmt)
{
if (Objects.equals(this.txnAmt, txnAmt)) {
return;
}
changes.put("TXN_AMT", new Integer[] {this.txnAmt, txnAmt});
this.txnAmt=txnAmt;
}
@JsonProperty("cashAmt")
public Integer getCashAmt()
{
return cashAmt;
}

public void initCashAmt(Integer cashAmt)
{
this.cashAmt=cashAmt;
}

public void setCashAmt(Integer cashAmt)
{
if (Objects.equals(this.cashAmt, cashAmt)) {
return;
}
changes.put("CASH_AMT", new Integer[] {this.cashAmt, cashAmt});
this.cashAmt=cashAmt;
}
@JsonProperty("txnCurrCode")
public String getTxnCurrCode()
{
return txnCurrCode;
}

public void initTxnCurrCode(String txnCurrCode)
{
this.txnCurrCode=txnCurrCode;
}

public void setTxnCurrCode(String txnCurrCode)
{
txnCurrCode= Strings.emptyToNull(txnCurrCode);
if (Objects.equals(this.txnCurrCode, txnCurrCode)) {
return;
}
changes.put("TXN_CURR_CODE", new String[] {this.txnCurrCode, txnCurrCode});
this.txnCurrCode=txnCurrCode;
}
@JsonProperty("exchangeRate")
public Integer getExchangeRate()
{
return exchangeRate;
}

public void initExchangeRate(Integer exchangeRate)
{
this.exchangeRate=exchangeRate;
}

public void setExchangeRate(Integer exchangeRate)
{
if (Objects.equals(this.exchangeRate, exchangeRate)) {
return;
}
changes.put("EXCHANGE_RATE", new Integer[] {this.exchangeRate, exchangeRate});
this.exchangeRate=exchangeRate;
}
@JsonProperty("overseasInd")
public String getOverseasInd()
{
return overseasInd;
}

public void initOverseasInd(String overseasInd)
{
this.overseasInd=overseasInd;
}

public void setOverseasInd(String overseasInd)
{
overseasInd= Strings.emptyToNull(overseasInd);
if (Objects.equals(this.overseasInd, overseasInd)) {
return;
}
changes.put("OVERSEAS_IND", new String[] {this.overseasInd, overseasInd});
this.overseasInd=overseasInd;
}
@JsonProperty("remBenAcctNumber")
public String getRemBenAcctNumber()
{
return remBenAcctNumber;
}

public void initRemBenAcctNumber(String remBenAcctNumber)
{
this.remBenAcctNumber=remBenAcctNumber;
}

public void setRemBenAcctNumber(String remBenAcctNumber)
{
remBenAcctNumber= Strings.emptyToNull(remBenAcctNumber);
if (Objects.equals(this.remBenAcctNumber, remBenAcctNumber)) {
return;
}
changes.put("REM_BEN_ACCT_NUMBER", new String[] {this.remBenAcctNumber, remBenAcctNumber});
this.remBenAcctNumber=remBenAcctNumber;
}
@JsonProperty("remBenAcctName")
public String getRemBenAcctName()
{
return remBenAcctName;
}

public void initRemBenAcctName(String remBenAcctName)
{
this.remBenAcctName=remBenAcctName;
}

public void setRemBenAcctName(String remBenAcctName)
{
remBenAcctName= Strings.emptyToNull(remBenAcctName);
if (Objects.equals(this.remBenAcctName, remBenAcctName)) {
return;
}
changes.put("REM_BEN_ACCT_NAME", new String[] {this.remBenAcctName, remBenAcctName});
this.remBenAcctName=remBenAcctName;
}
@JsonProperty("txnDesc")
public String getTxnDesc()
{
return txnDesc;
}

public void initTxnDesc(String txnDesc)
{
this.txnDesc=txnDesc;
}

public void setTxnDesc(String txnDesc)
{
txnDesc= Strings.emptyToNull(txnDesc);
if (Objects.equals(this.txnDesc, txnDesc)) {
return;
}
changes.put("TXN_DESC", new String[] {this.txnDesc, txnDesc});
this.txnDesc=txnDesc;
}
@JsonProperty("origFldOpt")
public String getOrigFldOpt()
{
return origFldOpt;
}

public void initOrigFldOpt(String origFldOpt)
{
this.origFldOpt=origFldOpt;
}

public void setOrigFldOpt(String origFldOpt)
{
origFldOpt= Strings.emptyToNull(origFldOpt);
if (Objects.equals(this.origFldOpt, origFldOpt)) {
return;
}
changes.put("ORIG_FLD_OPT", new String[] {this.origFldOpt, origFldOpt});
this.origFldOpt=origFldOpt;
}
@JsonProperty("originator")
public String getOriginator()
{
return originator;
}

public void initOriginator(String originator)
{
this.originator=originator;
}

public void setOriginator(String originator)
{
originator= Strings.emptyToNull(originator);
if (Objects.equals(this.originator, originator)) {
return;
}
changes.put("ORIGINATOR", new String[] {this.originator, originator});
this.originator=originator;
}
@JsonProperty("origBankFldOpt")
public String getOrigBankFldOpt()
{
return origBankFldOpt;
}

public void initOrigBankFldOpt(String origBankFldOpt)
{
this.origBankFldOpt=origBankFldOpt;
}

public void setOrigBankFldOpt(String origBankFldOpt)
{
origBankFldOpt= Strings.emptyToNull(origBankFldOpt);
if (Objects.equals(this.origBankFldOpt, origBankFldOpt)) {
return;
}
changes.put("ORIG_BANK_FLD_OPT", new String[] {this.origBankFldOpt, origBankFldOpt});
this.origBankFldOpt=origBankFldOpt;
}
@JsonProperty("origBank")
public String getOrigBank()
{
return origBank;
}

public void initOrigBank(String origBank)
{
this.origBank=origBank;
}

public void setOrigBank(String origBank)
{
origBank= Strings.emptyToNull(origBank);
if (Objects.equals(this.origBank, origBank)) {
return;
}
changes.put("ORIG_BANK", new String[] {this.origBank, origBank});
this.origBank=origBank;
}
@JsonProperty("sendBankFldOpt")
public String getSendBankFldOpt()
{
return sendBankFldOpt;
}

public void initSendBankFldOpt(String sendBankFldOpt)
{
this.sendBankFldOpt=sendBankFldOpt;
}

public void setSendBankFldOpt(String sendBankFldOpt)
{
sendBankFldOpt= Strings.emptyToNull(sendBankFldOpt);
if (Objects.equals(this.sendBankFldOpt, sendBankFldOpt)) {
return;
}
changes.put("SEND_BANK_FLD_OPT", new String[] {this.sendBankFldOpt, sendBankFldOpt});
this.sendBankFldOpt=sendBankFldOpt;
}
@JsonProperty("sendBank")
public String getSendBank()
{
return sendBank;
}

public void initSendBank(String sendBank)
{
this.sendBank=sendBank;
}

public void setSendBank(String sendBank)
{
sendBank= Strings.emptyToNull(sendBank);
if (Objects.equals(this.sendBank, sendBank)) {
return;
}
changes.put("SEND_BANK", new String[] {this.sendBank, sendBank});
this.sendBank=sendBank;
}
@JsonProperty("beneBankFldOpt")
public String getBeneBankFldOpt()
{
return beneBankFldOpt;
}

public void initBeneBankFldOpt(String beneBankFldOpt)
{
this.beneBankFldOpt=beneBankFldOpt;
}

public void setBeneBankFldOpt(String beneBankFldOpt)
{
beneBankFldOpt= Strings.emptyToNull(beneBankFldOpt);
if (Objects.equals(this.beneBankFldOpt, beneBankFldOpt)) {
return;
}
changes.put("BENE_BANK_FLD_OPT", new String[] {this.beneBankFldOpt, beneBankFldOpt});
this.beneBankFldOpt=beneBankFldOpt;
}
@JsonProperty("beneBank")
public String getBeneBank()
{
return beneBank;
}

public void initBeneBank(String beneBank)
{
this.beneBank=beneBank;
}

public void setBeneBank(String beneBank)
{
beneBank= Strings.emptyToNull(beneBank);
if (Objects.equals(this.beneBank, beneBank)) {
return;
}
changes.put("BENE_BANK", new String[] {this.beneBank, beneBank});
this.beneBank=beneBank;
}
@JsonProperty("beneFldOpt")
public String getBeneFldOpt()
{
return beneFldOpt;
}

public void initBeneFldOpt(String beneFldOpt)
{
this.beneFldOpt=beneFldOpt;
}

public void setBeneFldOpt(String beneFldOpt)
{
beneFldOpt= Strings.emptyToNull(beneFldOpt);
if (Objects.equals(this.beneFldOpt, beneFldOpt)) {
return;
}
changes.put("BENE_FLD_OPT", new String[] {this.beneFldOpt, beneFldOpt});
this.beneFldOpt=beneFldOpt;
}
@JsonProperty("beneficiary")
public String getBeneficiary()
{
return beneficiary;
}

public void initBeneficiary(String beneficiary)
{
this.beneficiary=beneficiary;
}

public void setBeneficiary(String beneficiary)
{
beneficiary= Strings.emptyToNull(beneficiary);
if (Objects.equals(this.beneficiary, beneficiary)) {
return;
}
changes.put("BENEFICIARY", new String[] {this.beneficiary, beneficiary});
this.beneficiary=beneficiary;
}
@JsonProperty("interFldOpt")
public String getInterFldOpt()
{
return interFldOpt;
}

public void initInterFldOpt(String interFldOpt)
{
this.interFldOpt=interFldOpt;
}

public void setInterFldOpt(String interFldOpt)
{
interFldOpt= Strings.emptyToNull(interFldOpt);
if (Objects.equals(this.interFldOpt, interFldOpt)) {
return;
}
changes.put("INTER_FLD_OPT", new String[] {this.interFldOpt, interFldOpt});
this.interFldOpt=interFldOpt;
}
@JsonProperty("interBank")
public String getInterBank()
{
return interBank;
}

public void initInterBank(String interBank)
{
this.interBank=interBank;
}

public void setInterBank(String interBank)
{
interBank= Strings.emptyToNull(interBank);
if (Objects.equals(this.interBank, interBank)) {
return;
}
changes.put("INTER_BANK", new String[] {this.interBank, interBank});
this.interBank=interBank;
}
@JsonProperty("trdReimbFldOpt")
public String getTrdReimbFldOpt()
{
return trdReimbFldOpt;
}

public void initTrdReimbFldOpt(String trdReimbFldOpt)
{
this.trdReimbFldOpt=trdReimbFldOpt;
}

public void setTrdReimbFldOpt(String trdReimbFldOpt)
{
trdReimbFldOpt= Strings.emptyToNull(trdReimbFldOpt);
if (Objects.equals(this.trdReimbFldOpt, trdReimbFldOpt)) {
return;
}
changes.put("TRD_REIMB_FLD_OPT", new String[] {this.trdReimbFldOpt, trdReimbFldOpt});
this.trdReimbFldOpt=trdReimbFldOpt;
}
@JsonProperty("trdReimbBank")
public String getTrdReimbBank()
{
return trdReimbBank;
}

public void initTrdReimbBank(String trdReimbBank)
{
this.trdReimbBank=trdReimbBank;
}

public void setTrdReimbBank(String trdReimbBank)
{
trdReimbBank= Strings.emptyToNull(trdReimbBank);
if (Objects.equals(this.trdReimbBank, trdReimbBank)) {
return;
}
changes.put("TRD_REIMB_BANK", new String[] {this.trdReimbBank, trdReimbBank});
this.trdReimbBank=trdReimbBank;
}
@JsonProperty("credPtySenderOpt")
public String getCredPtySenderOpt()
{
return credPtySenderOpt;
}

public void initCredPtySenderOpt(String credPtySenderOpt)
{
this.credPtySenderOpt=credPtySenderOpt;
}

public void setCredPtySenderOpt(String credPtySenderOpt)
{
credPtySenderOpt= Strings.emptyToNull(credPtySenderOpt);
if (Objects.equals(this.credPtySenderOpt, credPtySenderOpt)) {
return;
}
changes.put("CRED_PTY_SENDER_OPT", new String[] {this.credPtySenderOpt, credPtySenderOpt});
this.credPtySenderOpt=credPtySenderOpt;
}
@JsonProperty("credPtySender")
public String getCredPtySender()
{
return credPtySender;
}

public void initCredPtySender(String credPtySender)
{
this.credPtySender=credPtySender;
}

public void setCredPtySender(String credPtySender)
{
credPtySender= Strings.emptyToNull(credPtySender);
if (Objects.equals(this.credPtySender, credPtySender)) {
return;
}
changes.put("CRED_PTY_SENDER", new String[] {this.credPtySender, credPtySender});
this.credPtySender=credPtySender;
}
@JsonProperty("recvCorrFldOpt")
public String getRecvCorrFldOpt()
{
return recvCorrFldOpt;
}

public void initRecvCorrFldOpt(String recvCorrFldOpt)
{
this.recvCorrFldOpt=recvCorrFldOpt;
}

public void setRecvCorrFldOpt(String recvCorrFldOpt)
{
recvCorrFldOpt= Strings.emptyToNull(recvCorrFldOpt);
if (Objects.equals(this.recvCorrFldOpt, recvCorrFldOpt)) {
return;
}
changes.put("RECV_CORR_FLD_OPT", new String[] {this.recvCorrFldOpt, recvCorrFldOpt});
this.recvCorrFldOpt=recvCorrFldOpt;
}
@JsonProperty("receiverCorr")
public String getReceiverCorr()
{
return receiverCorr;
}

public void initReceiverCorr(String receiverCorr)
{
this.receiverCorr=receiverCorr;
}

public void setReceiverCorr(String receiverCorr)
{
receiverCorr= Strings.emptyToNull(receiverCorr);
if (Objects.equals(this.receiverCorr, receiverCorr)) {
return;
}
changes.put("RECEIVER_CORR", new String[] {this.receiverCorr, receiverCorr});
this.receiverCorr=receiverCorr;
}
@JsonProperty("paymentType")
public String getPaymentType()
{
return paymentType;
}

public void initPaymentType(String paymentType)
{
this.paymentType=paymentType;
}

public void setPaymentType(String paymentType)
{
paymentType= Strings.emptyToNull(paymentType);
if (Objects.equals(this.paymentType, paymentType)) {
return;
}
changes.put("PAYMENT_TYPE", new String[] {this.paymentType, paymentType});
this.paymentType=paymentType;
}
@JsonProperty("bankToBankCode")
public String getBankToBankCode()
{
return bankToBankCode;
}

public void initBankToBankCode(String bankToBankCode)
{
this.bankToBankCode=bankToBankCode;
}

public void setBankToBankCode(String bankToBankCode)
{
bankToBankCode= Strings.emptyToNull(bankToBankCode);
if (Objects.equals(this.bankToBankCode, bankToBankCode)) {
return;
}
changes.put("BANK_TO_BANK_CODE", new String[] {this.bankToBankCode, bankToBankCode});
this.bankToBankCode=bankToBankCode;
}
@JsonProperty("paymentDetail")
public String getPaymentDetail()
{
return paymentDetail;
}

public void initPaymentDetail(String paymentDetail)
{
this.paymentDetail=paymentDetail;
}

public void setPaymentDetail(String paymentDetail)
{
paymentDetail= Strings.emptyToNull(paymentDetail);
if (Objects.equals(this.paymentDetail, paymentDetail)) {
return;
}
changes.put("PAYMENT_DETAIL", new String[] {this.paymentDetail, paymentDetail});
this.paymentDetail=paymentDetail;
}
@JsonProperty("sendBankCtyCode")
public String getSendBankCtyCode()
{
return sendBankCtyCode;
}

public void initSendBankCtyCode(String sendBankCtyCode)
{
this.sendBankCtyCode=sendBankCtyCode;
}

public void setSendBankCtyCode(String sendBankCtyCode)
{
sendBankCtyCode= Strings.emptyToNull(sendBankCtyCode);
if (Objects.equals(this.sendBankCtyCode, sendBankCtyCode)) {
return;
}
changes.put("SEND_BANK_CTY_CODE", new String[] {this.sendBankCtyCode, sendBankCtyCode});
this.sendBankCtyCode=sendBankCtyCode;
}
@JsonProperty("origBankCtyCode")
public String getOrigBankCtyCode()
{
return origBankCtyCode;
}

public void initOrigBankCtyCode(String origBankCtyCode)
{
this.origBankCtyCode=origBankCtyCode;
}

public void setOrigBankCtyCode(String origBankCtyCode)
{
origBankCtyCode= Strings.emptyToNull(origBankCtyCode);
if (Objects.equals(this.origBankCtyCode, origBankCtyCode)) {
return;
}
changes.put("ORIG_BANK_CTY_CODE", new String[] {this.origBankCtyCode, origBankCtyCode});
this.origBankCtyCode=origBankCtyCode;
}
@JsonProperty("beneCtyCode")
public String getBeneCtyCode()
{
return beneCtyCode;
}

public void initBeneCtyCode(String beneCtyCode)
{
this.beneCtyCode=beneCtyCode;
}

public void setBeneCtyCode(String beneCtyCode)
{
beneCtyCode= Strings.emptyToNull(beneCtyCode);
if (Objects.equals(this.beneCtyCode, beneCtyCode)) {
return;
}
changes.put("BENE_CTY_CODE", new String[] {this.beneCtyCode, beneCtyCode});
this.beneCtyCode=beneCtyCode;
}
@JsonProperty("beneBankCtyCode")
public String getBeneBankCtyCode()
{
return beneBankCtyCode;
}

public void initBeneBankCtyCode(String beneBankCtyCode)
{
this.beneBankCtyCode=beneBankCtyCode;
}

public void setBeneBankCtyCode(String beneBankCtyCode)
{
beneBankCtyCode= Strings.emptyToNull(beneBankCtyCode);
if (Objects.equals(this.beneBankCtyCode, beneBankCtyCode)) {
return;
}
changes.put("BENE_BANK_CTY_CODE", new String[] {this.beneBankCtyCode, beneBankCtyCode});
this.beneBankCtyCode=beneBankCtyCode;
}
@JsonProperty("origCtyCode")
public String getOrigCtyCode()
{
return origCtyCode;
}

public void initOrigCtyCode(String origCtyCode)
{
this.origCtyCode=origCtyCode;
}

public void setOrigCtyCode(String origCtyCode)
{
origCtyCode= Strings.emptyToNull(origCtyCode);
if (Objects.equals(this.origCtyCode, origCtyCode)) {
return;
}
changes.put("ORIG_CTY_CODE", new String[] {this.origCtyCode, origCtyCode});
this.origCtyCode=origCtyCode;
}
@JsonProperty("interBankCtyCode")
public String getInterBankCtyCode()
{
return interBankCtyCode;
}

public void initInterBankCtyCode(String interBankCtyCode)
{
this.interBankCtyCode=interBankCtyCode;
}

public void setInterBankCtyCode(String interBankCtyCode)
{
interBankCtyCode= Strings.emptyToNull(interBankCtyCode);
if (Objects.equals(this.interBankCtyCode, interBankCtyCode)) {
return;
}
changes.put("INTER_BANK_CTY_CODE", new String[] {this.interBankCtyCode, interBankCtyCode});
this.interBankCtyCode=interBankCtyCode;
}
@JsonProperty("paymentDetailOpt")
public String getPaymentDetailOpt()
{
return paymentDetailOpt;
}

public void initPaymentDetailOpt(String paymentDetailOpt)
{
this.paymentDetailOpt=paymentDetailOpt;
}

public void setPaymentDetailOpt(String paymentDetailOpt)
{
paymentDetailOpt= Strings.emptyToNull(paymentDetailOpt);
if (Objects.equals(this.paymentDetailOpt, paymentDetailOpt)) {
return;
}
changes.put("PAYMENT_DETAIL_OPT", new String[] {this.paymentDetailOpt, paymentDetailOpt});
this.paymentDetailOpt=paymentDetailOpt;
}
@JsonProperty("paymentDetailCc")
public String getPaymentDetailCc()
{
return paymentDetailCc;
}

public void initPaymentDetailCc(String paymentDetailCc)
{
this.paymentDetailCc=paymentDetailCc;
}

public void setPaymentDetailCc(String paymentDetailCc)
{
paymentDetailCc= Strings.emptyToNull(paymentDetailCc);
if (Objects.equals(this.paymentDetailCc, paymentDetailCc)) {
return;
}
changes.put("PAYMENT_DETAIL_CC", new String[] {this.paymentDetailCc, paymentDetailCc});
this.paymentDetailCc=paymentDetailCc;
}
@JsonProperty("trdReimbCc")
public String getTrdReimbCc()
{
return trdReimbCc;
}

public void initTrdReimbCc(String trdReimbCc)
{
this.trdReimbCc=trdReimbCc;
}

public void setTrdReimbCc(String trdReimbCc)
{
trdReimbCc= Strings.emptyToNull(trdReimbCc);
if (Objects.equals(this.trdReimbCc, trdReimbCc)) {
return;
}
changes.put("TRD_REIMB_CC", new String[] {this.trdReimbCc, trdReimbCc});
this.trdReimbCc=trdReimbCc;
}
@JsonProperty("creditPtySenderCc")
public String getCreditPtySenderCc()
{
return creditPtySenderCc;
}

public void initCreditPtySenderCc(String creditPtySenderCc)
{
this.creditPtySenderCc=creditPtySenderCc;
}

public void setCreditPtySenderCc(String creditPtySenderCc)
{
creditPtySenderCc= Strings.emptyToNull(creditPtySenderCc);
if (Objects.equals(this.creditPtySenderCc, creditPtySenderCc)) {
return;
}
changes.put("CREDIT_PTY_SENDER_CC", new String[] {this.creditPtySenderCc, creditPtySenderCc});
this.creditPtySenderCc=creditPtySenderCc;
}
@JsonProperty("receiverCorrCc")
public String getReceiverCorrCc()
{
return receiverCorrCc;
}

public void initReceiverCorrCc(String receiverCorrCc)
{
this.receiverCorrCc=receiverCorrCc;
}

public void setReceiverCorrCc(String receiverCorrCc)
{
receiverCorrCc= Strings.emptyToNull(receiverCorrCc);
if (Objects.equals(this.receiverCorrCc, receiverCorrCc)) {
return;
}
changes.put("RECEIVER_CORR_CC", new String[] {this.receiverCorrCc, receiverCorrCc});
this.receiverCorrCc=receiverCorrCc;
}
@JsonProperty("origCity")
public String getOrigCity()
{
return origCity;
}

public void initOrigCity(String origCity)
{
this.origCity=origCity;
}

public void setOrigCity(String origCity)
{
origCity= Strings.emptyToNull(origCity);
if (Objects.equals(this.origCity, origCity)) {
return;
}
changes.put("ORIG_CITY", new String[] {this.origCity, origCity});
this.origCity=origCity;
}
@JsonProperty("origState")
public String getOrigState()
{
return origState;
}

public void initOrigState(String origState)
{
this.origState=origState;
}

public void setOrigState(String origState)
{
origState= Strings.emptyToNull(origState);
if (Objects.equals(this.origState, origState)) {
return;
}
changes.put("ORIG_STATE", new String[] {this.origState, origState});
this.origState=origState;
}
@JsonProperty("origPostCode")
public String getOrigPostCode()
{
return origPostCode;
}

public void initOrigPostCode(String origPostCode)
{
this.origPostCode=origPostCode;
}

public void setOrigPostCode(String origPostCode)
{
origPostCode= Strings.emptyToNull(origPostCode);
if (Objects.equals(this.origPostCode, origPostCode)) {
return;
}
changes.put("ORIG_POST_CODE", new String[] {this.origPostCode, origPostCode});
this.origPostCode=origPostCode;
}
@JsonProperty("origBankCity")
public String getOrigBankCity()
{
return origBankCity;
}

public void initOrigBankCity(String origBankCity)
{
this.origBankCity=origBankCity;
}

public void setOrigBankCity(String origBankCity)
{
origBankCity= Strings.emptyToNull(origBankCity);
if (Objects.equals(this.origBankCity, origBankCity)) {
return;
}
changes.put("ORIG_BANK_CITY", new String[] {this.origBankCity, origBankCity});
this.origBankCity=origBankCity;
}
@JsonProperty("origBankState")
public String getOrigBankState()
{
return origBankState;
}

public void initOrigBankState(String origBankState)
{
this.origBankState=origBankState;
}

public void setOrigBankState(String origBankState)
{
origBankState= Strings.emptyToNull(origBankState);
if (Objects.equals(this.origBankState, origBankState)) {
return;
}
changes.put("ORIG_BANK_STATE", new String[] {this.origBankState, origBankState});
this.origBankState=origBankState;
}
@JsonProperty("origBankPostCode")
public String getOrigBankPostCode()
{
return origBankPostCode;
}

public void initOrigBankPostCode(String origBankPostCode)
{
this.origBankPostCode=origBankPostCode;
}

public void setOrigBankPostCode(String origBankPostCode)
{
origBankPostCode= Strings.emptyToNull(origBankPostCode);
if (Objects.equals(this.origBankPostCode, origBankPostCode)) {
return;
}
changes.put("ORIG_BANK_POST_CODE", new String[] {this.origBankPostCode, origBankPostCode});
this.origBankPostCode=origBankPostCode;
}
@JsonProperty("beneCity")
public String getBeneCity()
{
return beneCity;
}

public void initBeneCity(String beneCity)
{
this.beneCity=beneCity;
}

public void setBeneCity(String beneCity)
{
beneCity= Strings.emptyToNull(beneCity);
if (Objects.equals(this.beneCity, beneCity)) {
return;
}
changes.put("BENE_CITY", new String[] {this.beneCity, beneCity});
this.beneCity=beneCity;
}
@JsonProperty("beneState")
public String getBeneState()
{
return beneState;
}

public void initBeneState(String beneState)
{
this.beneState=beneState;
}

public void setBeneState(String beneState)
{
beneState= Strings.emptyToNull(beneState);
if (Objects.equals(this.beneState, beneState)) {
return;
}
changes.put("BENE_STATE", new String[] {this.beneState, beneState});
this.beneState=beneState;
}
@JsonProperty("benePostCode")
public String getBenePostCode()
{
return benePostCode;
}

public void initBenePostCode(String benePostCode)
{
this.benePostCode=benePostCode;
}

public void setBenePostCode(String benePostCode)
{
benePostCode= Strings.emptyToNull(benePostCode);
if (Objects.equals(this.benePostCode, benePostCode)) {
return;
}
changes.put("BENE_POST_CODE", new String[] {this.benePostCode, benePostCode});
this.benePostCode=benePostCode;
}
@JsonProperty("beneBankCity")
public String getBeneBankCity()
{
return beneBankCity;
}

public void initBeneBankCity(String beneBankCity)
{
this.beneBankCity=beneBankCity;
}

public void setBeneBankCity(String beneBankCity)
{
beneBankCity= Strings.emptyToNull(beneBankCity);
if (Objects.equals(this.beneBankCity, beneBankCity)) {
return;
}
changes.put("BENE_BANK_CITY", new String[] {this.beneBankCity, beneBankCity});
this.beneBankCity=beneBankCity;
}
@JsonProperty("beneBankState")
public String getBeneBankState()
{
return beneBankState;
}

public void initBeneBankState(String beneBankState)
{
this.beneBankState=beneBankState;
}

public void setBeneBankState(String beneBankState)
{
beneBankState= Strings.emptyToNull(beneBankState);
if (Objects.equals(this.beneBankState, beneBankState)) {
return;
}
changes.put("BENE_BANK_STATE", new String[] {this.beneBankState, beneBankState});
this.beneBankState=beneBankState;
}
@JsonProperty("beneBankPostCode")
public String getBeneBankPostCode()
{
return beneBankPostCode;
}

public void initBeneBankPostCode(String beneBankPostCode)
{
this.beneBankPostCode=beneBankPostCode;
}

public void setBeneBankPostCode(String beneBankPostCode)
{
beneBankPostCode= Strings.emptyToNull(beneBankPostCode);
if (Objects.equals(this.beneBankPostCode, beneBankPostCode)) {
return;
}
changes.put("BENE_BANK_POST_CODE", new String[] {this.beneBankPostCode, beneBankPostCode});
this.beneBankPostCode=beneBankPostCode;
}
@JsonProperty("sendBankCity")
public String getSendBankCity()
{
return sendBankCity;
}

public void initSendBankCity(String sendBankCity)
{
this.sendBankCity=sendBankCity;
}

public void setSendBankCity(String sendBankCity)
{
sendBankCity= Strings.emptyToNull(sendBankCity);
if (Objects.equals(this.sendBankCity, sendBankCity)) {
return;
}
changes.put("SEND_BANK_CITY", new String[] {this.sendBankCity, sendBankCity});
this.sendBankCity=sendBankCity;
}
@JsonProperty("sendBankState")
public String getSendBankState()
{
return sendBankState;
}

public void initSendBankState(String sendBankState)
{
this.sendBankState=sendBankState;
}

public void setSendBankState(String sendBankState)
{
sendBankState= Strings.emptyToNull(sendBankState);
if (Objects.equals(this.sendBankState, sendBankState)) {
return;
}
changes.put("SEND_BANK_STATE", new String[] {this.sendBankState, sendBankState});
this.sendBankState=sendBankState;
}
@JsonProperty("sendBankPostCode")
public String getSendBankPostCode()
{
return sendBankPostCode;
}

public void initSendBankPostCode(String sendBankPostCode)
{
this.sendBankPostCode=sendBankPostCode;
}

public void setSendBankPostCode(String sendBankPostCode)
{
sendBankPostCode= Strings.emptyToNull(sendBankPostCode);
if (Objects.equals(this.sendBankPostCode, sendBankPostCode)) {
return;
}
changes.put("SEND_BANK_POST_CODE", new String[] {this.sendBankPostCode, sendBankPostCode});
this.sendBankPostCode=sendBankPostCode;
}
@JsonProperty("interBankCity")
public String getInterBankCity()
{
return interBankCity;
}

public void initInterBankCity(String interBankCity)
{
this.interBankCity=interBankCity;
}

public void setInterBankCity(String interBankCity)
{
interBankCity= Strings.emptyToNull(interBankCity);
if (Objects.equals(this.interBankCity, interBankCity)) {
return;
}
changes.put("INTER_BANK_CITY", new String[] {this.interBankCity, interBankCity});
this.interBankCity=interBankCity;
}
@JsonProperty("interBankState")
public String getInterBankState()
{
return interBankState;
}

public void initInterBankState(String interBankState)
{
this.interBankState=interBankState;
}

public void setInterBankState(String interBankState)
{
interBankState= Strings.emptyToNull(interBankState);
if (Objects.equals(this.interBankState, interBankState)) {
return;
}
changes.put("INTER_BANK_STATE", new String[] {this.interBankState, interBankState});
this.interBankState=interBankState;
}
@JsonProperty("interBankPostCode")
public String getInterBankPostCode()
{
return interBankPostCode;
}

public void initInterBankPostCode(String interBankPostCode)
{
this.interBankPostCode=interBankPostCode;
}

public void setInterBankPostCode(String interBankPostCode)
{
interBankPostCode= Strings.emptyToNull(interBankPostCode);
if (Objects.equals(this.interBankPostCode, interBankPostCode)) {
return;
}
changes.put("INTER_BANK_POST_CODE", new String[] {this.interBankPostCode, interBankPostCode});
this.interBankPostCode=interBankPostCode;
}
@JsonProperty("paymentBankCity")
public String getPaymentBankCity()
{
return paymentBankCity;
}

public void initPaymentBankCity(String paymentBankCity)
{
this.paymentBankCity=paymentBankCity;
}

public void setPaymentBankCity(String paymentBankCity)
{
paymentBankCity= Strings.emptyToNull(paymentBankCity);
if (Objects.equals(this.paymentBankCity, paymentBankCity)) {
return;
}
changes.put("PAYMENT_BANK_CITY", new String[] {this.paymentBankCity, paymentBankCity});
this.paymentBankCity=paymentBankCity;
}
@JsonProperty("paymentBankState")
public String getPaymentBankState()
{
return paymentBankState;
}

public void initPaymentBankState(String paymentBankState)
{
this.paymentBankState=paymentBankState;
}

public void setPaymentBankState(String paymentBankState)
{
paymentBankState= Strings.emptyToNull(paymentBankState);
if (Objects.equals(this.paymentBankState, paymentBankState)) {
return;
}
changes.put("PAYMENT_BANK_STATE", new String[] {this.paymentBankState, paymentBankState});
this.paymentBankState=paymentBankState;
}
@JsonProperty("paymentBankPostCode")
public String getPaymentBankPostCode()
{
return paymentBankPostCode;
}

public void initPaymentBankPostCode(String paymentBankPostCode)
{
this.paymentBankPostCode=paymentBankPostCode;
}

public void setPaymentBankPostCode(String paymentBankPostCode)
{
paymentBankPostCode= Strings.emptyToNull(paymentBankPostCode);
if (Objects.equals(this.paymentBankPostCode, paymentBankPostCode)) {
return;
}
changes.put("PAYMENT_BANK_POST_CODE", new String[] {this.paymentBankPostCode, paymentBankPostCode});
this.paymentBankPostCode=paymentBankPostCode;
}
@JsonProperty("trdReimbBankCity")
public String getTrdReimbBankCity()
{
return trdReimbBankCity;
}

public void initTrdReimbBankCity(String trdReimbBankCity)
{
this.trdReimbBankCity=trdReimbBankCity;
}

public void setTrdReimbBankCity(String trdReimbBankCity)
{
trdReimbBankCity= Strings.emptyToNull(trdReimbBankCity);
if (Objects.equals(this.trdReimbBankCity, trdReimbBankCity)) {
return;
}
changes.put("TRD_REIMB_BANK_CITY", new String[] {this.trdReimbBankCity, trdReimbBankCity});
this.trdReimbBankCity=trdReimbBankCity;
}
@JsonProperty("trdReimbBankState")
public String getTrdReimbBankState()
{
return trdReimbBankState;
}

public void initTrdReimbBankState(String trdReimbBankState)
{
this.trdReimbBankState=trdReimbBankState;
}

public void setTrdReimbBankState(String trdReimbBankState)
{
trdReimbBankState= Strings.emptyToNull(trdReimbBankState);
if (Objects.equals(this.trdReimbBankState, trdReimbBankState)) {
return;
}
changes.put("TRD_REIMB_BANK_STATE", new String[] {this.trdReimbBankState, trdReimbBankState});
this.trdReimbBankState=trdReimbBankState;
}
@JsonProperty("trdReimbBankPostCode")
public String getTrdReimbBankPostCode()
{
return trdReimbBankPostCode;
}

public void initTrdReimbBankPostCode(String trdReimbBankPostCode)
{
this.trdReimbBankPostCode=trdReimbBankPostCode;
}

public void setTrdReimbBankPostCode(String trdReimbBankPostCode)
{
trdReimbBankPostCode= Strings.emptyToNull(trdReimbBankPostCode);
if (Objects.equals(this.trdReimbBankPostCode, trdReimbBankPostCode)) {
return;
}
changes.put("TRD_REIMB_BANK_POST_CODE", new String[] {this.trdReimbBankPostCode, trdReimbBankPostCode});
this.trdReimbBankPostCode=trdReimbBankPostCode;
}
@JsonProperty("credPtyBankCity")
public String getCredPtyBankCity()
{
return credPtyBankCity;
}

public void initCredPtyBankCity(String credPtyBankCity)
{
this.credPtyBankCity=credPtyBankCity;
}

public void setCredPtyBankCity(String credPtyBankCity)
{
credPtyBankCity= Strings.emptyToNull(credPtyBankCity);
if (Objects.equals(this.credPtyBankCity, credPtyBankCity)) {
return;
}
changes.put("CRED_PTY_BANK_CITY", new String[] {this.credPtyBankCity, credPtyBankCity});
this.credPtyBankCity=credPtyBankCity;
}
@JsonProperty("credPtyBankState")
public String getCredPtyBankState()
{
return credPtyBankState;
}

public void initCredPtyBankState(String credPtyBankState)
{
this.credPtyBankState=credPtyBankState;
}

public void setCredPtyBankState(String credPtyBankState)
{
credPtyBankState= Strings.emptyToNull(credPtyBankState);
if (Objects.equals(this.credPtyBankState, credPtyBankState)) {
return;
}
changes.put("CRED_PTY_BANK_STATE", new String[] {this.credPtyBankState, credPtyBankState});
this.credPtyBankState=credPtyBankState;
}
@JsonProperty("credPtyBankPostCode")
public String getCredPtyBankPostCode()
{
return credPtyBankPostCode;
}

public void initCredPtyBankPostCode(String credPtyBankPostCode)
{
this.credPtyBankPostCode=credPtyBankPostCode;
}

public void setCredPtyBankPostCode(String credPtyBankPostCode)
{
credPtyBankPostCode= Strings.emptyToNull(credPtyBankPostCode);
if (Objects.equals(this.credPtyBankPostCode, credPtyBankPostCode)) {
return;
}
changes.put("CRED_PTY_BANK_POST_CODE", new String[] {this.credPtyBankPostCode, credPtyBankPostCode});
this.credPtyBankPostCode=credPtyBankPostCode;
}
@JsonProperty("recvCorrBankCity")
public String getRecvCorrBankCity()
{
return recvCorrBankCity;
}

public void initRecvCorrBankCity(String recvCorrBankCity)
{
this.recvCorrBankCity=recvCorrBankCity;
}

public void setRecvCorrBankCity(String recvCorrBankCity)
{
recvCorrBankCity= Strings.emptyToNull(recvCorrBankCity);
if (Objects.equals(this.recvCorrBankCity, recvCorrBankCity)) {
return;
}
changes.put("RECV_CORR_BANK_CITY", new String[] {this.recvCorrBankCity, recvCorrBankCity});
this.recvCorrBankCity=recvCorrBankCity;
}
@JsonProperty("recvCorrBankState")
public String getRecvCorrBankState()
{
return recvCorrBankState;
}

public void initRecvCorrBankState(String recvCorrBankState)
{
this.recvCorrBankState=recvCorrBankState;
}

public void setRecvCorrBankState(String recvCorrBankState)
{
recvCorrBankState= Strings.emptyToNull(recvCorrBankState);
if (Objects.equals(this.recvCorrBankState, recvCorrBankState)) {
return;
}
changes.put("RECV_CORR_BANK_STATE", new String[] {this.recvCorrBankState, recvCorrBankState});
this.recvCorrBankState=recvCorrBankState;
}
@JsonProperty("recvCorrBankPostCode")
public String getRecvCorrBankPostCode()
{
return recvCorrBankPostCode;
}

public void initRecvCorrBankPostCode(String recvCorrBankPostCode)
{
this.recvCorrBankPostCode=recvCorrBankPostCode;
}

public void setRecvCorrBankPostCode(String recvCorrBankPostCode)
{
recvCorrBankPostCode= Strings.emptyToNull(recvCorrBankPostCode);
if (Objects.equals(this.recvCorrBankPostCode, recvCorrBankPostCode)) {
return;
}
changes.put("RECV_CORR_BANK_POST_CODE", new String[] {this.recvCorrBankPostCode, recvCorrBankPostCode});
this.recvCorrBankPostCode=recvCorrBankPostCode;
}
@JsonProperty("senderRefNo")
public String getSenderRefNo()
{
return senderRefNo;
}

public void initSenderRefNo(String senderRefNo)
{
this.senderRefNo=senderRefNo;
}

public void setSenderRefNo(String senderRefNo)
{
senderRefNo= Strings.emptyToNull(senderRefNo);
if (Objects.equals(this.senderRefNo, senderRefNo)) {
return;
}
changes.put("SENDER_REF_NO", new String[] {this.senderRefNo, senderRefNo});
this.senderRefNo=senderRefNo;
}
@JsonProperty("relatedRefNo")
public String getRelatedRefNo()
{
return relatedRefNo;
}

public void initRelatedRefNo(String relatedRefNo)
{
this.relatedRefNo=relatedRefNo;
}

public void setRelatedRefNo(String relatedRefNo)
{
relatedRefNo= Strings.emptyToNull(relatedRefNo);
if (Objects.equals(this.relatedRefNo, relatedRefNo)) {
return;
}
changes.put("RELATED_REF_NO", new String[] {this.relatedRefNo, relatedRefNo});
this.relatedRefNo=relatedRefNo;
}
@JsonProperty("chipFedRefNo")
public String getChipFedRefNo()
{
return chipFedRefNo;
}

public void initChipFedRefNo(String chipFedRefNo)
{
this.chipFedRefNo=chipFedRefNo;
}

public void setChipFedRefNo(String chipFedRefNo)
{
chipFedRefNo= Strings.emptyToNull(chipFedRefNo);
if (Objects.equals(this.chipFedRefNo, chipFedRefNo)) {
return;
}
changes.put("CHIP_FED_REF_NO", new String[] {this.chipFedRefNo, chipFedRefNo});
this.chipFedRefNo=chipFedRefNo;
}
@JsonProperty("isOrigRecvBank")
public String getOrigRecvBank()
{
return isOrigRecvBank;
}

public void initOrigRecvBank(String isOrigRecvBank)
{
this.isOrigRecvBank=isOrigRecvBank;
}

public void setOrigRecvBank(String isOrigRecvBank)
{
isOrigRecvBank= Strings.emptyToNull(isOrigRecvBank);
if (Objects.equals(this.isOrigRecvBank, isOrigRecvBank)) {
return;
}
changes.put("IS_ORIG_RECV_BANK", new String[] {this.isOrigRecvBank, isOrigRecvBank});
this.isOrigRecvBank=isOrigRecvBank;
}
@JsonProperty("isoCtyCode")
public String getIsoCtyCode()
{
return isoCtyCode;
}

public void initIsoCtyCode(String isoCtyCode)
{
this.isoCtyCode=isoCtyCode;
}

public void setIsoCtyCode(String isoCtyCode)
{
isoCtyCode= Strings.emptyToNull(isoCtyCode);
if (Objects.equals(this.isoCtyCode, isoCtyCode)) {
return;
}
changes.put("ISO_CTY_CODE", new String[] {this.isoCtyCode, isoCtyCode});
this.isoCtyCode=isoCtyCode;
}
@JsonProperty("filler")
public String getFiller()
{
return filler;
}

public void initFiller(String filler)
{
this.filler=filler;
}

public void setFiller(String filler)
{
filler= Strings.emptyToNull(filler);
if (Objects.equals(this.filler, filler)) {
return;
}
changes.put("FILLER", new String[] {this.filler, filler});
this.filler=filler;
}
@Override
public String toString()
{
return toStringHelper(this)
.add("appSrcCode", appSrcCode)
.add("origSysSrcCode", origSysSrcCode)
.add("respCenter", respCenter)
.add("acctNumber", acctNumber)
.add("txnValueDate", txnValueDate)
.add("txnPostDate", txnPostDate)
.add("txnCode", txnCode)
.add("txnType", txnType)
.add("convTxnAmt", convTxnAmt)
.add("convPostAmt", convPostAmt)
.add("refNumber", refNumber)
.add("branchAtmNumber", branchAtmNumber)
.add("tellerAtmNumber", tellerAtmNumber)
.add("checkNumber", checkNumber)
.add("numberOfChecks", numberOfChecks)
.add("typeInd", typeInd)
.add("txnAmt", txnAmt)
.add("cashAmt", cashAmt)
.add("txnCurrCode", txnCurrCode)
.add("exchangeRate", exchangeRate)
.add("overseasInd", overseasInd)
.add("remBenAcctNumber", remBenAcctNumber)
.add("remBenAcctName", remBenAcctName)
.add("txnDesc", txnDesc)
.add("origFldOpt", origFldOpt)
.add("originator", originator)
.add("origBankFldOpt", origBankFldOpt)
.add("origBank", origBank)
.add("sendBankFldOpt", sendBankFldOpt)
.add("sendBank", sendBank)
.add("beneBankFldOpt", beneBankFldOpt)
.add("beneBank", beneBank)
.add("beneFldOpt", beneFldOpt)
.add("beneficiary", beneficiary)
.add("interFldOpt", interFldOpt)
.add("interBank", interBank)
.add("trdReimbFldOpt", trdReimbFldOpt)
.add("trdReimbBank", trdReimbBank)
.add("credPtySenderOpt", credPtySenderOpt)
.add("credPtySender", credPtySender)
.add("recvCorrFldOpt", recvCorrFldOpt)
.add("receiverCorr", receiverCorr)
.add("paymentType", paymentType)
.add("bankToBankCode", bankToBankCode)
.add("paymentDetail", paymentDetail)
.add("sendBankCtyCode", sendBankCtyCode)
.add("origBankCtyCode", origBankCtyCode)
.add("beneCtyCode", beneCtyCode)
.add("beneBankCtyCode", beneBankCtyCode)
.add("origCtyCode", origCtyCode)
.add("interBankCtyCode", interBankCtyCode)
.add("paymentDetailOpt", paymentDetailOpt)
.add("paymentDetailCc", paymentDetailCc)
.add("trdReimbCc", trdReimbCc)
.add("creditPtySenderCc", creditPtySenderCc)
.add("receiverCorrCc", receiverCorrCc)
.add("origCity", origCity)
.add("origState", origState)
.add("origPostCode", origPostCode)
.add("origBankCity", origBankCity)
.add("origBankState", origBankState)
.add("origBankPostCode", origBankPostCode)
.add("beneCity", beneCity)
.add("beneState", beneState)
.add("benePostCode", benePostCode)
.add("beneBankCity", beneBankCity)
.add("beneBankState", beneBankState)
.add("beneBankPostCode", beneBankPostCode)
.add("sendBankCity", sendBankCity)
.add("sendBankState", sendBankState)
.add("sendBankPostCode", sendBankPostCode)
.add("interBankCity", interBankCity)
.add("interBankState", interBankState)
.add("interBankPostCode", interBankPostCode)
.add("paymentBankCity", paymentBankCity)
.add("paymentBankState", paymentBankState)
.add("paymentBankPostCode", paymentBankPostCode)
.add("trdReimbBankCity", trdReimbBankCity)
.add("trdReimbBankState", trdReimbBankState)
.add("trdReimbBankPostCode", trdReimbBankPostCode)
.add("credPtyBankCity", credPtyBankCity)
.add("credPtyBankState", credPtyBankState)
.add("credPtyBankPostCode", credPtyBankPostCode)
.add("recvCorrBankCity", recvCorrBankCity)
.add("recvCorrBankState", recvCorrBankState)
.add("recvCorrBankPostCode", recvCorrBankPostCode)
.add("senderRefNo", senderRefNo)
.add("relatedRefNo", relatedRefNo)
.add("chipFedRefNo", chipFedRefNo)
.add("isOrigRecvBank", isOrigRecvBank)
.add("isoCtyCode", isoCtyCode)
.add("filler", filler)
.toString();
}

public void update(WireTxn other)
{
setAppSrcCode(other.getAppSrcCode());
setOrigSysSrcCode(other.getOrigSysSrcCode());
setRespCenter(other.getRespCenter());
setAcctNumber(other.getAcctNumber());
setTxnValueDate(other.getTxnValueDate());
setTxnPostDate(other.getTxnPostDate());
setTxnCode(other.getTxnCode());
setTxnType(other.getTxnType());
setConvTxnAmt(other.getConvTxnAmt());
setConvPostAmt(other.getConvPostAmt());
setRefNumber(other.getRefNumber());
setBranchAtmNumber(other.getBranchAtmNumber());
setTellerAtmNumber(other.getTellerAtmNumber());
setCheckNumber(other.getCheckNumber());
setNumberOfChecks(other.getNumberOfChecks());
setTypeInd(other.getTypeInd());
setTxnAmt(other.getTxnAmt());
setCashAmt(other.getCashAmt());
setTxnCurrCode(other.getTxnCurrCode());
setExchangeRate(other.getExchangeRate());
setOverseasInd(other.getOverseasInd());
setRemBenAcctNumber(other.getRemBenAcctNumber());
setRemBenAcctName(other.getRemBenAcctName());
setTxnDesc(other.getTxnDesc());
setOrigFldOpt(other.getOrigFldOpt());
setOriginator(other.getOriginator());
setOrigBankFldOpt(other.getOrigBankFldOpt());
setOrigBank(other.getOrigBank());
setSendBankFldOpt(other.getSendBankFldOpt());
setSendBank(other.getSendBank());
setBeneBankFldOpt(other.getBeneBankFldOpt());
setBeneBank(other.getBeneBank());
setBeneFldOpt(other.getBeneFldOpt());
setBeneficiary(other.getBeneficiary());
setInterFldOpt(other.getInterFldOpt());
setInterBank(other.getInterBank());
setTrdReimbFldOpt(other.getTrdReimbFldOpt());
setTrdReimbBank(other.getTrdReimbBank());
setCredPtySenderOpt(other.getCredPtySenderOpt());
setCredPtySender(other.getCredPtySender());
setRecvCorrFldOpt(other.getRecvCorrFldOpt());
setReceiverCorr(other.getReceiverCorr());
setPaymentType(other.getPaymentType());
setBankToBankCode(other.getBankToBankCode());
setPaymentDetail(other.getPaymentDetail());
setSendBankCtyCode(other.getSendBankCtyCode());
setOrigBankCtyCode(other.getOrigBankCtyCode());
setBeneCtyCode(other.getBeneCtyCode());
setBeneBankCtyCode(other.getBeneBankCtyCode());
setOrigCtyCode(other.getOrigCtyCode());
setInterBankCtyCode(other.getInterBankCtyCode());
setPaymentDetailOpt(other.getPaymentDetailOpt());
setPaymentDetailCc(other.getPaymentDetailCc());
setTrdReimbCc(other.getTrdReimbCc());
setCreditPtySenderCc(other.getCreditPtySenderCc());
setReceiverCorrCc(other.getReceiverCorrCc());
setOrigCity(other.getOrigCity());
setOrigState(other.getOrigState());
setOrigPostCode(other.getOrigPostCode());
setOrigBankCity(other.getOrigBankCity());
setOrigBankState(other.getOrigBankState());
setOrigBankPostCode(other.getOrigBankPostCode());
setBeneCity(other.getBeneCity());
setBeneState(other.getBeneState());
setBenePostCode(other.getBenePostCode());
setBeneBankCity(other.getBeneBankCity());
setBeneBankState(other.getBeneBankState());
setBeneBankPostCode(other.getBeneBankPostCode());
setSendBankCity(other.getSendBankCity());
setSendBankState(other.getSendBankState());
setSendBankPostCode(other.getSendBankPostCode());
setInterBankCity(other.getInterBankCity());
setInterBankState(other.getInterBankState());
setInterBankPostCode(other.getInterBankPostCode());
setPaymentBankCity(other.getPaymentBankCity());
setPaymentBankState(other.getPaymentBankState());
setPaymentBankPostCode(other.getPaymentBankPostCode());
setTrdReimbBankCity(other.getTrdReimbBankCity());
setTrdReimbBankState(other.getTrdReimbBankState());
setTrdReimbBankPostCode(other.getTrdReimbBankPostCode());
setCredPtyBankCity(other.getCredPtyBankCity());
setCredPtyBankState(other.getCredPtyBankState());
setCredPtyBankPostCode(other.getCredPtyBankPostCode());
setRecvCorrBankCity(other.getRecvCorrBankCity());
setRecvCorrBankState(other.getRecvCorrBankState());
setRecvCorrBankPostCode(other.getRecvCorrBankPostCode());
setSenderRefNo(other.getSenderRefNo());
setRelatedRefNo(other.getRelatedRefNo());
setChipFedRefNo(other.getChipFedRefNo());
setOrigRecvBank(other.getOrigRecvBank());
setIsoCtyCode(other.getIsoCtyCode());
setFiller(other.getFiller());
}

public String[] getRow()
{
return new String[]{
getAppSrcCode()==null ? "" : getAppSrcCode().toString(),
getOrigSysSrcCode()==null ? "" : getOrigSysSrcCode().toString(),
getRespCenter()==null ? "" : getRespCenter().toString(),
getAcctNumber()==null ? "" : getAcctNumber().toString(),
getTxnValueDate()==null ? "" : getTxnValueDate().toString(),
getTxnPostDate()==null ? "" : getTxnPostDate().toString(),
getTxnCode()==null ? "" : getTxnCode().toString(),
getTxnType()==null ? "" : getTxnType().toString(),
getConvTxnAmt()==null ? "" : getConvTxnAmt().toString(),
getConvPostAmt()==null ? "" : getConvPostAmt().toString(),
getRefNumber()==null ? "" : getRefNumber().toString(),
getBranchAtmNumber()==null ? "" : getBranchAtmNumber().toString(),
getTellerAtmNumber()==null ? "" : getTellerAtmNumber().toString(),
getCheckNumber()==null ? "" : getCheckNumber().toString(),
getNumberOfChecks()==null ? "" : getNumberOfChecks().toString(),
getTypeInd()==null ? "" : getTypeInd().toString(),
getTxnAmt()==null ? "" : getTxnAmt().toString(),
getCashAmt()==null ? "" : getCashAmt().toString(),
getTxnCurrCode()==null ? "" : getTxnCurrCode().toString(),
getExchangeRate()==null ? "" : getExchangeRate().toString(),
getOverseasInd()==null ? "" : getOverseasInd().toString(),
getRemBenAcctNumber()==null ? "" : getRemBenAcctNumber().toString(),
getRemBenAcctName()==null ? "" : getRemBenAcctName().toString(),
getTxnDesc()==null ? "" : getTxnDesc().toString(),
getOrigFldOpt()==null ? "" : getOrigFldOpt().toString(),
getOriginator()==null ? "" : getOriginator().toString(),
getOrigBankFldOpt()==null ? "" : getOrigBankFldOpt().toString(),
getOrigBank()==null ? "" : getOrigBank().toString(),
getSendBankFldOpt()==null ? "" : getSendBankFldOpt().toString(),
getSendBank()==null ? "" : getSendBank().toString(),
getBeneBankFldOpt()==null ? "" : getBeneBankFldOpt().toString(),
getBeneBank()==null ? "" : getBeneBank().toString(),
getBeneFldOpt()==null ? "" : getBeneFldOpt().toString(),
getBeneficiary()==null ? "" : getBeneficiary().toString(),
getInterFldOpt()==null ? "" : getInterFldOpt().toString(),
getInterBank()==null ? "" : getInterBank().toString(),
getTrdReimbFldOpt()==null ? "" : getTrdReimbFldOpt().toString(),
getTrdReimbBank()==null ? "" : getTrdReimbBank().toString(),
getCredPtySenderOpt()==null ? "" : getCredPtySenderOpt().toString(),
getCredPtySender()==null ? "" : getCredPtySender().toString(),
getRecvCorrFldOpt()==null ? "" : getRecvCorrFldOpt().toString(),
getReceiverCorr()==null ? "" : getReceiverCorr().toString(),
getPaymentType()==null ? "" : getPaymentType().toString(),
getBankToBankCode()==null ? "" : getBankToBankCode().toString(),
getPaymentDetail()==null ? "" : getPaymentDetail().toString(),
getSendBankCtyCode()==null ? "" : getSendBankCtyCode().toString(),
getOrigBankCtyCode()==null ? "" : getOrigBankCtyCode().toString(),
getBeneCtyCode()==null ? "" : getBeneCtyCode().toString(),
getBeneBankCtyCode()==null ? "" : getBeneBankCtyCode().toString(),
getOrigCtyCode()==null ? "" : getOrigCtyCode().toString(),
getInterBankCtyCode()==null ? "" : getInterBankCtyCode().toString(),
getPaymentDetailOpt()==null ? "" : getPaymentDetailOpt().toString(),
getPaymentDetailCc()==null ? "" : getPaymentDetailCc().toString(),
getTrdReimbCc()==null ? "" : getTrdReimbCc().toString(),
getCreditPtySenderCc()==null ? "" : getCreditPtySenderCc().toString(),
getReceiverCorrCc()==null ? "" : getReceiverCorrCc().toString(),
getOrigCity()==null ? "" : getOrigCity().toString(),
getOrigState()==null ? "" : getOrigState().toString(),
getOrigPostCode()==null ? "" : getOrigPostCode().toString(),
getOrigBankCity()==null ? "" : getOrigBankCity().toString(),
getOrigBankState()==null ? "" : getOrigBankState().toString(),
getOrigBankPostCode()==null ? "" : getOrigBankPostCode().toString(),
getBeneCity()==null ? "" : getBeneCity().toString(),
getBeneState()==null ? "" : getBeneState().toString(),
getBenePostCode()==null ? "" : getBenePostCode().toString(),
getBeneBankCity()==null ? "" : getBeneBankCity().toString(),
getBeneBankState()==null ? "" : getBeneBankState().toString(),
getBeneBankPostCode()==null ? "" : getBeneBankPostCode().toString(),
getSendBankCity()==null ? "" : getSendBankCity().toString(),
getSendBankState()==null ? "" : getSendBankState().toString(),
getSendBankPostCode()==null ? "" : getSendBankPostCode().toString(),
getInterBankCity()==null ? "" : getInterBankCity().toString(),
getInterBankState()==null ? "" : getInterBankState().toString(),
getInterBankPostCode()==null ? "" : getInterBankPostCode().toString(),
getPaymentBankCity()==null ? "" : getPaymentBankCity().toString(),
getPaymentBankState()==null ? "" : getPaymentBankState().toString(),
getPaymentBankPostCode()==null ? "" : getPaymentBankPostCode().toString(),
getTrdReimbBankCity()==null ? "" : getTrdReimbBankCity().toString(),
getTrdReimbBankState()==null ? "" : getTrdReimbBankState().toString(),
getTrdReimbBankPostCode()==null ? "" : getTrdReimbBankPostCode().toString(),
getCredPtyBankCity()==null ? "" : getCredPtyBankCity().toString(),
getCredPtyBankState()==null ? "" : getCredPtyBankState().toString(),
getCredPtyBankPostCode()==null ? "" : getCredPtyBankPostCode().toString(),
getRecvCorrBankCity()==null ? "" : getRecvCorrBankCity().toString(),
getRecvCorrBankState()==null ? "" : getRecvCorrBankState().toString(),
getRecvCorrBankPostCode()==null ? "" : getRecvCorrBankPostCode().toString(),
getSenderRefNo()==null ? "" : getSenderRefNo().toString(),
getRelatedRefNo()==null ? "" : getRelatedRefNo().toString(),
getChipFedRefNo()==null ? "" : getChipFedRefNo().toString(),
getOrigRecvBank()==null ? "" : getOrigRecvBank().toString(),
getIsoCtyCode()==null ? "" : getIsoCtyCode().toString(),
getFiller()==null ? "" : getFiller().toString()
};
}

// table name =  WIRE_TXN
/**** 
Column{name='APP_SRC_CODE', type=12, typeName='VARCHAR2', size=3, digitSize=0}
Column{name='ORIG_SYS_SRC_CODE', type=12, typeName='VARCHAR2', size=3, digitSize=0}
Column{name='RESP_CENTER', type=12, typeName='VARCHAR2', size=5, digitSize=0}
Column{name='ACCT_NUMBER', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='TXN_VALUE_DATE', type=12, typeName='VARCHAR2', size=8, digitSize=0}
Column{name='TXN_POST_DATE', type=12, typeName='VARCHAR2', size=8, digitSize=0}
Column{name='TXN_CODE', type=12, typeName='VARCHAR2', size=6, digitSize=0}
Column{name='TXN_TYPE', type=12, typeName='VARCHAR2', size=4, digitSize=0}
Column{name='CONV_TXN_AMT', type=2, typeName='NUMBER', size=0, digitSize=-127}
Column{name='CONV_POST_AMT', type=2, typeName='NUMBER', size=0, digitSize=-127}
Column{name='REF_NUMBER', type=12, typeName='VARCHAR2', size=30, digitSize=0}
Column{name='BRANCH_ATM_NUMBER', type=12, typeName='VARCHAR2', size=5, digitSize=0}
Column{name='TELLER_ATM_NUMBER', type=12, typeName='VARCHAR2', size=4, digitSize=0}
Column{name='CHECK_NUMBER', type=12, typeName='VARCHAR2', size=10, digitSize=0}
Column{name='NUMBER_OF_CHECKS', type=2, typeName='NUMBER', size=0, digitSize=-127}
Column{name='TYPE_IND', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='TXN_AMT', type=2, typeName='NUMBER', size=0, digitSize=-127}
Column{name='CASH_AMT', type=2, typeName='NUMBER', size=0, digitSize=-127}
Column{name='TXN_CURR_CODE', type=12, typeName='VARCHAR2', size=3, digitSize=0}
Column{name='EXCHANGE_RATE', type=2, typeName='NUMBER', size=0, digitSize=-127}
Column{name='OVERSEAS_IND', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='REM_BEN_ACCT_NUMBER', type=12, typeName='VARCHAR2', size=34, digitSize=0}
Column{name='REM_BEN_ACCT_NAME', type=12, typeName='VARCHAR2', size=50, digitSize=0}
Column{name='TXN_DESC', type=12, typeName='VARCHAR2', size=70, digitSize=0}
Column{name='ORIG_FLD_OPT', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='ORIGINATOR', type=12, typeName='VARCHAR2', size=200, digitSize=0}
Column{name='ORIG_BANK_FLD_OPT', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='ORIG_BANK', type=12, typeName='VARCHAR2', size=200, digitSize=0}
Column{name='SEND_BANK_FLD_OPT', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='SEND_BANK', type=12, typeName='VARCHAR2', size=200, digitSize=0}
Column{name='BENE_BANK_FLD_OPT', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='BENE_BANK', type=12, typeName='VARCHAR2', size=200, digitSize=0}
Column{name='BENE_FLD_OPT', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='BENEFICIARY', type=12, typeName='VARCHAR2', size=200, digitSize=0}
Column{name='INTER_FLD_OPT', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='INTER_BANK', type=12, typeName='VARCHAR2', size=200, digitSize=0}
Column{name='TRD_REIMB_FLD_OPT', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='TRD_REIMB_BANK', type=12, typeName='VARCHAR2', size=200, digitSize=0}
Column{name='CRED_PTY_SENDER_OPT', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='CRED_PTY_SENDER', type=12, typeName='VARCHAR2', size=200, digitSize=0}
Column{name='RECV_CORR_FLD_OPT', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='RECEIVER_CORR', type=12, typeName='VARCHAR2', size=200, digitSize=0}
Column{name='PAYMENT_TYPE', type=12, typeName='VARCHAR2', size=5, digitSize=0}
Column{name='BANK_TO_BANK_CODE', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='PAYMENT_DETAIL', type=12, typeName='VARCHAR2', size=1000, digitSize=0}
Column{name='SEND_BANK_CTY_CODE', type=12, typeName='VARCHAR2', size=2, digitSize=0}
Column{name='ORIG_BANK_CTY_CODE', type=12, typeName='VARCHAR2', size=2, digitSize=0}
Column{name='BENE_CTY_CODE', type=12, typeName='VARCHAR2', size=2, digitSize=0}
Column{name='BENE_BANK_CTY_CODE', type=12, typeName='VARCHAR2', size=2, digitSize=0}
Column{name='ORIG_CTY_CODE', type=12, typeName='VARCHAR2', size=2, digitSize=0}
Column{name='INTER_BANK_CTY_CODE', type=12, typeName='VARCHAR2', size=2, digitSize=0}
Column{name='PAYMENT_DETAIL_OPT', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='PAYMENT_DETAIL_CC', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='TRD_REIMB_CC', type=12, typeName='VARCHAR2', size=10, digitSize=0}
Column{name='CREDIT_PTY_SENDER_CC', type=12, typeName='VARCHAR2', size=10, digitSize=0}
Column{name='RECEIVER_CORR_CC', type=12, typeName='VARCHAR2', size=10, digitSize=0}
Column{name='ORIG_CITY', type=12, typeName='VARCHAR2', size=100, digitSize=0}
Column{name='ORIG_STATE', type=12, typeName='VARCHAR2', size=30, digitSize=0}
Column{name='ORIG_POST_CODE', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='ORIG_BANK_CITY', type=12, typeName='VARCHAR2', size=100, digitSize=0}
Column{name='ORIG_BANK_STATE', type=12, typeName='VARCHAR2', size=30, digitSize=0}
Column{name='ORIG_BANK_POST_CODE', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='BENE_CITY', type=12, typeName='VARCHAR2', size=100, digitSize=0}
Column{name='BENE_STATE', type=12, typeName='VARCHAR2', size=30, digitSize=0}
Column{name='BENE_POST_CODE', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='BENE_BANK_CITY', type=12, typeName='VARCHAR2', size=100, digitSize=0}
Column{name='BENE_BANK_STATE', type=12, typeName='VARCHAR2', size=30, digitSize=0}
Column{name='BENE_BANK_POST_CODE', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='SEND_BANK_CITY', type=12, typeName='VARCHAR2', size=100, digitSize=0}
Column{name='SEND_BANK_STATE', type=12, typeName='VARCHAR2', size=30, digitSize=0}
Column{name='SEND_BANK_POST_CODE', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='INTER_BANK_CITY', type=12, typeName='VARCHAR2', size=100, digitSize=0}
Column{name='INTER_BANK_STATE', type=12, typeName='VARCHAR2', size=30, digitSize=0}
Column{name='INTER_BANK_POST_CODE', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='PAYMENT_BANK_CITY', type=12, typeName='VARCHAR2', size=100, digitSize=0}
Column{name='PAYMENT_BANK_STATE', type=12, typeName='VARCHAR2', size=30, digitSize=0}
Column{name='PAYMENT_BANK_POST_CODE', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='TRD_REIMB_BANK_CITY', type=12, typeName='VARCHAR2', size=100, digitSize=0}
Column{name='TRD_REIMB_BANK_STATE', type=12, typeName='VARCHAR2', size=30, digitSize=0}
Column{name='TRD_REIMB_BANK_POST_CODE', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='CRED_PTY_BANK_CITY', type=12, typeName='VARCHAR2', size=100, digitSize=0}
Column{name='CRED_PTY_BANK_STATE', type=12, typeName='VARCHAR2', size=30, digitSize=0}
Column{name='CRED_PTY_BANK_POST_CODE', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='RECV_CORR_BANK_CITY', type=12, typeName='VARCHAR2', size=100, digitSize=0}
Column{name='RECV_CORR_BANK_STATE', type=12, typeName='VARCHAR2', size=30, digitSize=0}
Column{name='RECV_CORR_BANK_POST_CODE', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='SENDER_REF_NO', type=12, typeName='VARCHAR2', size=30, digitSize=0}
Column{name='RELATED_REF_NO', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='CHIP_FED_REF_NO', type=12, typeName='VARCHAR2', size=20, digitSize=0}
Column{name='IS_ORIG_RECV_BANK', type=12, typeName='VARCHAR2', size=1, digitSize=0}
Column{name='ISO_CTY_CODE', type=12, typeName='VARCHAR2', size=2, digitSize=0}
Column{name='FILLER', type=12, typeName='VARCHAR2', size=7, digitSize=0}

*****/

/*****
public static List<WireTxn> getWireTxn(int num)
    {
        ImmutableList.Builder<WireTxn> builder =  ImmutableList.builder();

        for(int i=0; i<num; i++) {
            WireTxn base = new WireTxn();
base.initAppSrcCode("appSrcCode--"+ i);
base.initOrigSysSrcCode("origSysSrcCode--"+ i);
base.initRespCenter("respCenter--"+ i);
base.initAcctNumber("acctNumber--"+ i);
base.initTxnValueDate("txnValueDate--"+ i);
base.initTxnPostDate("txnPostDate--"+ i);
base.initTxnCode("txnCode--"+ i);
base.initTxnType("txnType--"+ i);
base.initConvTxnAmt(new Integer(i));
base.initConvPostAmt(new Integer(i));
base.initRefNumber("refNumber--"+ i);
base.initBranchAtmNumber("branchAtmNumber--"+ i);
base.initTellerAtmNumber("tellerAtmNumber--"+ i);
base.initCheckNumber("checkNumber--"+ i);
base.initNumberOfChecks(new Integer(i));
base.initTypeInd("typeInd--"+ i);
base.initTxnAmt(new Integer(i));
base.initCashAmt(new Integer(i));
base.initTxnCurrCode("txnCurrCode--"+ i);
base.initExchangeRate(new Integer(i));
base.initOverseasInd("overseasInd--"+ i);
base.initRemBenAcctNumber("remBenAcctNumber--"+ i);
base.initRemBenAcctName("remBenAcctName--"+ i);
base.initTxnDesc("txnDesc--"+ i);
base.initOrigFldOpt("origFldOpt--"+ i);
base.initOriginator("originator--"+ i);
base.initOrigBankFldOpt("origBankFldOpt--"+ i);
base.initOrigBank("origBank--"+ i);
base.initSendBankFldOpt("sendBankFldOpt--"+ i);
base.initSendBank("sendBank--"+ i);
base.initBeneBankFldOpt("beneBankFldOpt--"+ i);
base.initBeneBank("beneBank--"+ i);
base.initBeneFldOpt("beneFldOpt--"+ i);
base.initBeneficiary("beneficiary--"+ i);
base.initInterFldOpt("interFldOpt--"+ i);
base.initInterBank("interBank--"+ i);
base.initTrdReimbFldOpt("trdReimbFldOpt--"+ i);
base.initTrdReimbBank("trdReimbBank--"+ i);
base.initCredPtySenderOpt("credPtySenderOpt--"+ i);
base.initCredPtySender("credPtySender--"+ i);
base.initRecvCorrFldOpt("recvCorrFldOpt--"+ i);
base.initReceiverCorr("receiverCorr--"+ i);
base.initPaymentType("paymentType--"+ i);
base.initBankToBankCode("bankToBankCode--"+ i);
base.initPaymentDetail("paymentDetail--"+ i);
base.initSendBankCtyCode("sendBankCtyCode--"+ i);
base.initOrigBankCtyCode("origBankCtyCode--"+ i);
base.initBeneCtyCode("beneCtyCode--"+ i);
base.initBeneBankCtyCode("beneBankCtyCode--"+ i);
base.initOrigCtyCode("origCtyCode--"+ i);
base.initInterBankCtyCode("interBankCtyCode--"+ i);
base.initPaymentDetailOpt("paymentDetailOpt--"+ i);
base.initPaymentDetailCc("paymentDetailCc--"+ i);
base.initTrdReimbCc("trdReimbCc--"+ i);
base.initCreditPtySenderCc("creditPtySenderCc--"+ i);
base.initReceiverCorrCc("receiverCorrCc--"+ i);
base.initOrigCity("origCity--"+ i);
base.initOrigState("origState--"+ i);
base.initOrigPostCode("origPostCode--"+ i);
base.initOrigBankCity("origBankCity--"+ i);
base.initOrigBankState("origBankState--"+ i);
base.initOrigBankPostCode("origBankPostCode--"+ i);
base.initBeneCity("beneCity--"+ i);
base.initBeneState("beneState--"+ i);
base.initBenePostCode("benePostCode--"+ i);
base.initBeneBankCity("beneBankCity--"+ i);
base.initBeneBankState("beneBankState--"+ i);
base.initBeneBankPostCode("beneBankPostCode--"+ i);
base.initSendBankCity("sendBankCity--"+ i);
base.initSendBankState("sendBankState--"+ i);
base.initSendBankPostCode("sendBankPostCode--"+ i);
base.initInterBankCity("interBankCity--"+ i);
base.initInterBankState("interBankState--"+ i);
base.initInterBankPostCode("interBankPostCode--"+ i);
base.initPaymentBankCity("paymentBankCity--"+ i);
base.initPaymentBankState("paymentBankState--"+ i);
base.initPaymentBankPostCode("paymentBankPostCode--"+ i);
base.initTrdReimbBankCity("trdReimbBankCity--"+ i);
base.initTrdReimbBankState("trdReimbBankState--"+ i);
base.initTrdReimbBankPostCode("trdReimbBankPostCode--"+ i);
base.initCredPtyBankCity("credPtyBankCity--"+ i);
base.initCredPtyBankState("credPtyBankState--"+ i);
base.initCredPtyBankPostCode("credPtyBankPostCode--"+ i);
base.initRecvCorrBankCity("recvCorrBankCity--"+ i);
base.initRecvCorrBankState("recvCorrBankState--"+ i);
base.initRecvCorrBankPostCode("recvCorrBankPostCode--"+ i);
base.initSenderRefNo("senderRefNo--"+ i);
base.initRelatedRefNo("relatedRefNo--"+ i);
base.initChipFedRefNo("chipFedRefNo--"+ i);
base.initOrigRecvBank("isOrigRecvBank--"+ i);
base.initIsoCtyCode("isoCtyCode--"+ i);
base.initFiller("filler--"+ i);

        base.setStartRow(1);
        base.setPageSize(20);
        base.setUid(String.valueOf(i));
        base.setQuery("");
        base.setSortField("");
        base.setSortOrder("");
            builder.add(base);
        }
        return builder.build();
    }

******/

////string, string, string, string, string, string, string, string, integer, integer, string, string, string, string, integer, string, integer, integer, string, integer, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, string, 
}

