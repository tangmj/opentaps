<#--
 * Copyright (c) 2006 - 2009 Open Source Strategies, Inc.
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
-->
<@import location="component://opentaps-common/webapp/common/includes/lib/opentapsFormMacros.ftl"/>

<#if picklistInfo?has_content>
<#if isPicklistPicked?exists>
  <@form name="closePicklistAction" url="closePicklist" picklistId=picklistInfo.picklistId />
</#if>
<div class="subSectionHeader">
  <div class="subSectionTitle">${uiLabelMap.WarehousePicklistDetails}</div>
  <div class="subMenuBar">
    <a href="<@ofbizUrl>PicklistReport.pdf?picklistId=${picklistInfo.picklistId}</@ofbizUrl>" target="_blank" class="buttontext">${uiLabelMap.OpentapsContentType_ApplicationPDF}</a>
    <#if isPicklistPicked?exists>
      <@submitFormLink form="closePicklistAction" class="subMenuButton" text=uiLabelMap.WarehouseClosePicklists />
    </#if>
  </div>
</div>
</#if>