CREATE TABLE IF NOT EXISTS jit_payment_inst_details (
  id varchar(256),
  tenantId varchar(64) NOT NULL,
  piNumber varchar(256),
  parentPiNumber varchar(256),
  muktaReferenceId varchar(256),
  numBeneficiaries int,
  grossAmount numeric(12,2),
  netAmount numeric(12,2),
  piStatus varchar(64),
  piSuccessCode varchar(256),
  piSuccessDesc varchar(256),
  piApprovedId varchar(256),
  piApprovalDate varchar(256),
  piErrorResp varchar(256),
  additionalDetails jsonb,
  createdtime bigint,
  createdby varchar(256),
  lastmodifiedtime bigint,
  lastmodifiedby varchar(256)
);
ALTER TABLE jit_payment_inst_details ADD CONSTRAINT jit_payment_inst_details_pkey PRIMARY KEY (id);
