/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.raybia.dealer.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.math.BigDecimal;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Raybia_Dealer&quot; database table.
 *
 * @author Peter Richards
 * @see Dealer
 * @generated
 */
public class DealerTable extends BaseTable<DealerTable> {

	public static final DealerTable INSTANCE = new DealerTable();

	public final Column<DealerTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DealerTable, Long> dealerId = createColumn(
		"dealerId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DealerTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DealerTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DealerTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DealerTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DealerTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DealerTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<DealerTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DealerTable, String> street = createColumn(
		"street", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DealerTable, String> locality = createColumn(
		"locality", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DealerTable, String> state = createColumn(
		"state_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DealerTable, String> postalCode = createColumn(
		"postalCode", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DealerTable, String> emailAddress = createColumn(
		"emailAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DealerTable, String> phoneNumber = createColumn(
		"phoneNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DealerTable, String> openingHours = createColumn(
		"openingHours", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DealerTable, BigDecimal> latitude = createColumn(
		"latitude", BigDecimal.class, Types.DECIMAL, Column.FLAG_DEFAULT);
	public final Column<DealerTable, BigDecimal> longitude = createColumn(
		"longitude", BigDecimal.class, Types.DECIMAL, Column.FLAG_DEFAULT);

	private DealerTable() {
		super("Raybia_Dealer", DealerTable::new);
	}

}