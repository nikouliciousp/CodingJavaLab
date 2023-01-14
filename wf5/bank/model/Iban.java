package gr.aueb.cf.projects.wf5.bank.model;

/**
 * Creates an Iban instance.
 *
 * @author Periklis Nikoulis
 * @version 1.0
 */
public class Iban {
    private String ibanStr;
    private int ibanNum;

    /**
     * Creates Iban Account with default Constructor.
     */
    public Iban() {
        ibanStr = "GR";
    }

    /**
     * Gets ibanStr 's Iban.
     *
     * @return
     *      ibanStr 's Iban
     */
    public String getIbanStr() {
        return ibanStr;
    }

    /**
     * Sets ibanStr 's Iban
     * @param ibanStr
     *      ibanStr 's Iban
     */
    public void setIbanStr(String ibanStr) {
        this.ibanStr = ibanStr;
    }

    /**
     * Gets ibanNum 's Iban.
     *
     * @return
     *      ibanNum 's Iban
     */
    public int getIbanNum() {
        ibanNum++;
        return ibanNum;
    }

    /**
     * Sets ibanNum 's Iban.
     *
     * @param ibanNum
     *      ibanNum 's Iban
     */
    public void setIbanNumA(int ibanNum) {
        this.ibanNum = ibanNum;
    }
}
