package com.zn.base;

public enum EnumTest {

	Pending(0, "待审核"), Approved(1, "审核通过"), Rejected(2, "拒绝"), NotSubmitted(3, "未提交");
	private int value;
	private String text;

	private EnumTest(int value, String text) {
		this.value = value;
		this.text = text;
	}

	public int toValue() {
		return value;
	}

	public String toText() {
		return text;
	}

	public static EnumTest fromValue(int value) {
		for (EnumTest s : EnumTest.values()) {
			if (value == s.toValue())
				return s;
		}
		return null;
	}

	public static EnumTest fromString(String value) {
		if (value == null || value.isEmpty()) {
			return null;
		}

		for (EnumTest s : EnumTest.values()) {
			if (value.equalsIgnoreCase(s.toString())) {
				return s;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		EnumTest et1 = EnumTest.fromString("Pending");
		
		EnumTest et2 = EnumTest.fromValue(1);
		
		System.out.println(et1.text); // 待审核
		System.out.println(et1.toString()); // Pending

		switch (et1) {
		case Pending:
			System.out.println("switch pending");
			break;

		default:
			break;
		}
	}

}
