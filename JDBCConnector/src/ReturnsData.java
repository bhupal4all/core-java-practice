

import java.math.BigDecimal;
import java.sql.Timestamp;

public class ReturnsData {
	private BigDecimal returnId = null;
	private String returnNbr = "";
	private BigDecimal retrndQty = null;
	private Timestamp shippedDate;

	public String getColumnName(String property) {
		switch (property) {
		case "returnId":
			return "RETURN_ID";
		case "returnNbr":
			return "RETURN_NBR";
		case "retrndQty":
			return "RETRND_QTY";
		case "shippedDate":
			return "SHIPPED_DATE";
		default:
			return "";
		}
	}

	public BigDecimal getReturnId() {
		return returnId;
	}

	public void setReturnId(BigDecimal returnId) {
		this.returnId = returnId;
	}

	public String getReturnNbr() {
		return returnNbr;
	}

	public void setReturnNbr(String returnNbr) {
		this.returnNbr = returnNbr;
	}

	public BigDecimal getRetrndQty() {
		return retrndQty;
	}

	public void setRetrndQty(BigDecimal retrndQty) {
		this.retrndQty = retrndQty;
	}

	public Timestamp getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Timestamp shippedDate) {
		this.shippedDate = shippedDate;
	}

	@Override
	public String toString() {
		return "GLOBCReturnsData [returnId=" + returnId + ", returnNbr=" + returnNbr + ", retrndQty=" + retrndQty
				+ ", shippedDate=" + shippedDate + "]";
	}

}