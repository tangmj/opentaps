package org.opentaps.base.entities;

/*
 * Copyright (c) 2008 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javolution.util.FastMap;

import org.opentaps.foundation.entity.Entity;
import org.opentaps.foundation.entity.EntityFieldInterface;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
import javax.persistence.*;
import org.hibernate.search.annotations.*;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Auto generated base entity PartyBenefit.
 */
@javax.persistence.Entity
@Table(name="PARTY_BENEFIT")
public class PartyBenefit extends Entity {
static {
java.util.Map<String, String> fields = new java.util.HashMap<String, String>();
        fields.put("roleTypeIdFrom", "ROLE_TYPE_ID_FROM");
        fields.put("roleTypeIdTo", "ROLE_TYPE_ID_TO");
        fields.put("partyIdFrom", "PARTY_ID_FROM");
        fields.put("partyIdTo", "PARTY_ID_TO");
        fields.put("benefitTypeId", "BENEFIT_TYPE_ID");
        fields.put("fromDate", "FROM_DATE");
        fields.put("thruDate", "THRU_DATE");
        fields.put("periodTypeId", "PERIOD_TYPE_ID");
        fields.put("cost", "COST");
        fields.put("actualEmployerPaidPercent", "ACTUAL_EMPLOYER_PAID_PERCENT");
        fields.put("availableTime", "AVAILABLE_TIME");
        fields.put("lastUpdatedStamp", "LAST_UPDATED_STAMP");
        fields.put("lastUpdatedTxStamp", "LAST_UPDATED_TX_STAMP");
        fields.put("createdStamp", "CREATED_STAMP");
        fields.put("createdTxStamp", "CREATED_TX_STAMP");
fieldMapColumns.put("PartyBenefit", fields);
}
  public static enum Fields implements EntityFieldInterface<PartyBenefit> {
    roleTypeIdFrom("roleTypeIdFrom"),
    roleTypeIdTo("roleTypeIdTo"),
    partyIdFrom("partyIdFrom"),
    partyIdTo("partyIdTo"),
    benefitTypeId("benefitTypeId"),
    fromDate("fromDate"),
    thruDate("thruDate"),
    periodTypeId("periodTypeId"),
    cost("cost"),
    actualEmployerPaidPercent("actualEmployerPaidPercent"),
    availableTime("availableTime"),
    lastUpdatedStamp("lastUpdatedStamp"),
    lastUpdatedTxStamp("lastUpdatedTxStamp"),
    createdStamp("createdStamp"),
    createdTxStamp("createdTxStamp");
    private final String fieldName;
    private Fields(String name) { fieldName = name; }
    /** {@inheritDoc} */
    public String getName() { return fieldName; }
    /** {@inheritDoc} */
    public String asc() { return fieldName + " ASC"; }
    /** {@inheritDoc} */
    public String desc() { return fieldName + " DESC"; }
  }

   @EmbeddedId

   @FieldBridge(impl = org.opentaps.base.entities.bridge.PartyBenefitPkBridge.class)
     private PartyBenefitPk id = new PartyBenefitPk();
   
    /**
     * Auto generated Id accessor.
     * @return <code>PartyBenefitPk</code>
     */
      public PartyBenefitPk getId() {
         return id;
      }
    /**
     * Auto generated Id setter.
     * @param id a <code>PartyBenefitPk</code> value to set
    */   
      public void setId(PartyBenefitPk id) {
         this.id = id;
      }
   @Column(name="THRU_DATE")
   private Timestamp thruDate;
   @Column(name="PERIOD_TYPE_ID")
   private String periodTypeId;
   @Column(name="COST")
   private BigDecimal cost;
   @Column(name="ACTUAL_EMPLOYER_PAID_PERCENT")
   private BigDecimal actualEmployerPaidPercent;
   @Column(name="AVAILABLE_TIME")
   private Long availableTime;
   @Column(name="LAST_UPDATED_STAMP")
   private Timestamp lastUpdatedStamp;
   @Column(name="LAST_UPDATED_TX_STAMP")
   private Timestamp lastUpdatedTxStamp;
   @Column(name="CREATED_STAMP")
   private Timestamp createdStamp;
   @Column(name="CREATED_TX_STAMP")
   private Timestamp createdTxStamp;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID_TO", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party toParty = null;
   private transient PartyRole toPartyRole = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PARTY_ID_FROM", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private Party fromParty = null;
   private transient PartyRole fromPartyRole = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="BENEFIT_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private BenefitType benefitType = null;
   @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
   @JoinColumn(name="PERIOD_TYPE_ID", insertable=false, updatable=false)
   @org.hibernate.annotations.Generated(
      org.hibernate.annotations.GenerationTime.ALWAYS
   )
   
   private PeriodType periodType = null;

  /**
   * Default constructor.
   */
  public PartyBenefit() {
      super();
      this.baseEntityName = "PartyBenefit";
      this.isView = false;
      
      this.primaryKeyNames = new ArrayList<String>();
      this.primaryKeyNames.add("roleTypeIdFrom");this.primaryKeyNames.add("roleTypeIdTo");this.primaryKeyNames.add("partyIdFrom");this.primaryKeyNames.add("partyIdTo");this.primaryKeyNames.add("benefitTypeId");this.primaryKeyNames.add("fromDate");
      this.allFieldsNames = new ArrayList<String>();
      this.allFieldsNames.add("roleTypeIdFrom");this.allFieldsNames.add("roleTypeIdTo");this.allFieldsNames.add("partyIdFrom");this.allFieldsNames.add("partyIdTo");this.allFieldsNames.add("benefitTypeId");this.allFieldsNames.add("fromDate");this.allFieldsNames.add("thruDate");this.allFieldsNames.add("periodTypeId");this.allFieldsNames.add("cost");this.allFieldsNames.add("actualEmployerPaidPercent");this.allFieldsNames.add("availableTime");this.allFieldsNames.add("lastUpdatedStamp");this.allFieldsNames.add("lastUpdatedTxStamp");this.allFieldsNames.add("createdStamp");this.allFieldsNames.add("createdTxStamp");
      this.nonPrimaryKeyNames = new ArrayList<String>();
      this.nonPrimaryKeyNames.addAll(allFieldsNames);
      this.nonPrimaryKeyNames.removeAll(primaryKeyNames);
  }

  /**
   * Constructor with a repository.
   * @param repository a <code>RepositoryInterface</code> value
   */
  public PartyBenefit(RepositoryInterface repository) {
      this();
      initRepository(repository);
  }

    /**
     * Auto generated value setter.
     * @param roleTypeIdFrom the roleTypeIdFrom to set
     */
    public void setRoleTypeIdFrom(String roleTypeIdFrom) {
        id.setRoleTypeIdFrom(roleTypeIdFrom);
    }
    /**
     * Auto generated value setter.
     * @param roleTypeIdTo the roleTypeIdTo to set
     */
    public void setRoleTypeIdTo(String roleTypeIdTo) {
        id.setRoleTypeIdTo(roleTypeIdTo);
    }
    /**
     * Auto generated value setter.
     * @param partyIdFrom the partyIdFrom to set
     */
    public void setPartyIdFrom(String partyIdFrom) {
        id.setPartyIdFrom(partyIdFrom);
    }
    /**
     * Auto generated value setter.
     * @param partyIdTo the partyIdTo to set
     */
    public void setPartyIdTo(String partyIdTo) {
        id.setPartyIdTo(partyIdTo);
    }
    /**
     * Auto generated value setter.
     * @param benefitTypeId the benefitTypeId to set
     */
    public void setBenefitTypeId(String benefitTypeId) {
        id.setBenefitTypeId(benefitTypeId);
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        id.setFromDate(fromDate);
    }
    /**
     * Auto generated value setter.
     * @param thruDate the thruDate to set
     */
    public void setThruDate(Timestamp thruDate) {
        this.thruDate = thruDate;
    }
    /**
     * Auto generated value setter.
     * @param periodTypeId the periodTypeId to set
     */
    public void setPeriodTypeId(String periodTypeId) {
        this.periodTypeId = periodTypeId;
    }
    /**
     * Auto generated value setter.
     * @param cost the cost to set
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
    /**
     * Auto generated value setter.
     * @param actualEmployerPaidPercent the actualEmployerPaidPercent to set
     */
    public void setActualEmployerPaidPercent(BigDecimal actualEmployerPaidPercent) {
        this.actualEmployerPaidPercent = actualEmployerPaidPercent;
    }
    /**
     * Auto generated value setter.
     * @param availableTime the availableTime to set
     */
    public void setAvailableTime(Long availableTime) {
        this.availableTime = availableTime;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedStamp the lastUpdatedStamp to set
     */
    public void setLastUpdatedStamp(Timestamp lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }
    /**
     * Auto generated value setter.
     * @param lastUpdatedTxStamp the lastUpdatedTxStamp to set
     */
    public void setLastUpdatedTxStamp(Timestamp lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdStamp the createdStamp to set
     */
    public void setCreatedStamp(Timestamp createdStamp) {
        this.createdStamp = createdStamp;
    }
    /**
     * Auto generated value setter.
     * @param createdTxStamp the createdTxStamp to set
     */
    public void setCreatedTxStamp(Timestamp createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdFrom() {
        return this.id.getRoleTypeIdFrom();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeIdTo() {
        return this.id.getRoleTypeIdTo();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdFrom() {
        return this.id.getPartyIdFrom();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPartyIdTo() {
        return this.id.getPartyIdTo();
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getBenefitTypeId() {
        return this.id.getBenefitTypeId();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.id.getFromDate();
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getThruDate() {
        return this.thruDate;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPeriodTypeId() {
        return this.periodTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getCost() {
        return this.cost;
    }
    /**
     * Auto generated value accessor.
     * @return <code>BigDecimal</code>
     */
    public BigDecimal getActualEmployerPaidPercent() {
        return this.actualEmployerPaidPercent;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Long</code>
     */
    public Long getAvailableTime() {
        return this.availableTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedStamp() {
        return this.lastUpdatedStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getLastUpdatedTxStamp() {
        return this.lastUpdatedTxStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedStamp() {
        return this.createdStamp;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getCreatedTxStamp() {
        return this.createdTxStamp;
    }

    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>ToParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getToParty() throws RepositoryException {
        if (this.toParty == null) {
            this.toParty = getRelatedOne(Party.class, "ToParty");
        }
        return this.toParty;
    }
    /**
     * Auto generated method that gets the related <code>PartyRole</code> by the relation named <code>ToPartyRole</code>.
     * @return the <code>PartyRole</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyRole getToPartyRole() throws RepositoryException {
        if (this.toPartyRole == null) {
            this.toPartyRole = getRelatedOne(PartyRole.class, "ToPartyRole");
        }
        return this.toPartyRole;
    }
    /**
     * Auto generated method that gets the related <code>Party</code> by the relation named <code>FromParty</code>.
     * @return the <code>Party</code>
     * @throws RepositoryException if an error occurs
     */
    public Party getFromParty() throws RepositoryException {
        if (this.fromParty == null) {
            this.fromParty = getRelatedOne(Party.class, "FromParty");
        }
        return this.fromParty;
    }
    /**
     * Auto generated method that gets the related <code>PartyRole</code> by the relation named <code>FromPartyRole</code>.
     * @return the <code>PartyRole</code>
     * @throws RepositoryException if an error occurs
     */
    public PartyRole getFromPartyRole() throws RepositoryException {
        if (this.fromPartyRole == null) {
            this.fromPartyRole = getRelatedOne(PartyRole.class, "FromPartyRole");
        }
        return this.fromPartyRole;
    }
    /**
     * Auto generated method that gets the related <code>BenefitType</code> by the relation named <code>BenefitType</code>.
     * @return the <code>BenefitType</code>
     * @throws RepositoryException if an error occurs
     */
    public BenefitType getBenefitType() throws RepositoryException {
        if (this.benefitType == null) {
            this.benefitType = getRelatedOne(BenefitType.class, "BenefitType");
        }
        return this.benefitType;
    }
    /**
     * Auto generated method that gets the related <code>PeriodType</code> by the relation named <code>PeriodType</code>.
     * @return the <code>PeriodType</code>
     * @throws RepositoryException if an error occurs
     */
    public PeriodType getPeriodType() throws RepositoryException {
        if (this.periodType == null) {
            this.periodType = getRelatedOne(PeriodType.class, "PeriodType");
        }
        return this.periodType;
    }

    /**
     * Auto generated value setter.
     * @param toParty the toParty to set
    */
    public void setToParty(Party toParty) {
        this.toParty = toParty;
    }
    /**
     * Auto generated value setter.
     * @param toPartyRole the toPartyRole to set
    */
    public void setToPartyRole(PartyRole toPartyRole) {
        this.toPartyRole = toPartyRole;
    }
    /**
     * Auto generated value setter.
     * @param fromParty the fromParty to set
    */
    public void setFromParty(Party fromParty) {
        this.fromParty = fromParty;
    }
    /**
     * Auto generated value setter.
     * @param fromPartyRole the fromPartyRole to set
    */
    public void setFromPartyRole(PartyRole fromPartyRole) {
        this.fromPartyRole = fromPartyRole;
    }
    /**
     * Auto generated value setter.
     * @param benefitType the benefitType to set
    */
    public void setBenefitType(BenefitType benefitType) {
        this.benefitType = benefitType;
    }
    /**
     * Auto generated value setter.
     * @param periodType the periodType to set
    */
    public void setPeriodType(PeriodType periodType) {
        this.periodType = periodType;
    }


    /** {@inheritDoc} */
    @Override
    public void fromMap(Map<String, Object> mapValue) {
        preInit();
        setRoleTypeIdFrom((String) mapValue.get("roleTypeIdFrom"));
        setRoleTypeIdTo((String) mapValue.get("roleTypeIdTo"));
        setPartyIdFrom((String) mapValue.get("partyIdFrom"));
        setPartyIdTo((String) mapValue.get("partyIdTo"));
        setBenefitTypeId((String) mapValue.get("benefitTypeId"));
        setFromDate((Timestamp) mapValue.get("fromDate"));
        setThruDate((Timestamp) mapValue.get("thruDate"));
        setPeriodTypeId((String) mapValue.get("periodTypeId"));
        setCost(convertToBigDecimal(mapValue.get("cost")));
        setActualEmployerPaidPercent(convertToBigDecimal(mapValue.get("actualEmployerPaidPercent")));
        setAvailableTime((Long) mapValue.get("availableTime"));
        setLastUpdatedStamp((Timestamp) mapValue.get("lastUpdatedStamp"));
        setLastUpdatedTxStamp((Timestamp) mapValue.get("lastUpdatedTxStamp"));
        setCreatedStamp((Timestamp) mapValue.get("createdStamp"));
        setCreatedTxStamp((Timestamp) mapValue.get("createdTxStamp"));
        postInit();
    }

    /** {@inheritDoc} */
    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        mapValue.put("roleTypeIdFrom", getRoleTypeIdFrom());
        mapValue.put("roleTypeIdTo", getRoleTypeIdTo());
        mapValue.put("partyIdFrom", getPartyIdFrom());
        mapValue.put("partyIdTo", getPartyIdTo());
        mapValue.put("benefitTypeId", getBenefitTypeId());
        mapValue.put("fromDate", getFromDate());
        mapValue.put("thruDate", getThruDate());
        mapValue.put("periodTypeId", getPeriodTypeId());
        mapValue.put("cost", getCost());
        mapValue.put("actualEmployerPaidPercent", getActualEmployerPaidPercent());
        mapValue.put("availableTime", getAvailableTime());
        mapValue.put("lastUpdatedStamp", getLastUpdatedStamp());
        mapValue.put("lastUpdatedTxStamp", getLastUpdatedTxStamp());
        mapValue.put("createdStamp", getCreatedStamp());
        mapValue.put("createdTxStamp", getCreatedTxStamp());
        return mapValue;
    }


}