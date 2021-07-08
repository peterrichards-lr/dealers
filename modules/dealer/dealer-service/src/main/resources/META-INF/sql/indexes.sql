create index IX_D5F43DFC on Raybia_Dealer (groupId);
create index IX_B22414E2 on Raybia_Dealer (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_2E106BE4 on Raybia_Dealer (uuid_[$COLUMN_LENGTH:75$], groupId);