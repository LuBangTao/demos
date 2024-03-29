package cn.lannis.demo.codegenerater.utils;

import java.util.List;

import org.springframework.util.StringUtils;

public class CodeStringUtils {
	public static String getStringSplit(String[] val) {
		StringBuffer sqlStr = new StringBuffer();
		for (String s : val) {
			if (!StringUtils.isEmpty(s)) {
				sqlStr.append(",");
				sqlStr.append("'");
				sqlStr.append(s.trim());
				sqlStr.append("'");
			}
		}
		return sqlStr.toString().substring(1);
	}

	public static String getInitialSmall(String str) {
		if (!StringUtils.isEmpty(str)) {
			str = str.substring(0, 1).toLowerCase() + str.substring(1);
		}
		return str;
	}

	public static Integer getIntegerNotNull(Integer t) {
		if (t == null) {
			return Integer.valueOf(0);
		}
		return t;
	}

	public static boolean isIn(String substring, String[] source) {
		if ((source == null) || (source.length == 0)) {
			return false;
		}
		for (int i = 0; i < source.length; i++) {
			String aSource = source[i];
			if (aSource.equals(substring)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isIn(String substring, List<String> ls) {
		String[] source = new String[0];
		if (ls != null) {
			source = (String[]) ls.toArray();
		}
		if ((source == null) || (source.length == 0)) {
			return false;
		}
		for (int i = 0; i < source.length; i++) {
			String aSource = source[i];
			if (aSource.equals(substring)) {
				return true;
			}
		}
		return false;
	}
}
