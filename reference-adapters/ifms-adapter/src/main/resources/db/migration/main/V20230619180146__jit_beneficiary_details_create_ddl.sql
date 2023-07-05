CREATE TABLE IF NOT EXISTS jit_beneficiary_details (
  id varchar(256),
  tenantId varchar(64) NOT NULL,
  muktaReferenceId varchar(256),
  piId varchar(256) NOT NULL,
  beneficiaryId varchar(256) NOT NULL,
  amount numeric(12,2),
  voucherNumber varchar(256),
  voucherDate timestamp,
  utrNo varchar(256),
  utrDate varchar(64),
  endToEndId varchar(256),
  challanNumber varchar(256),
  challanDate varchar(64),
  paymentStatus varchar(64),
  paymentStatusMessage varchar(256),
  additionalDetails jsonb,
  createdtime bigint,
  createdby varchar(256),
  lastmodifiedtime bigint,
  lastmodifiedby varchar(256)
);
ALTER TABLE jit_beneficiary_details ADD CONSTRAINT jit_beneficiary_details_pkey PRIMARY KEY (id);
