<#-- 
 * Copyright (c) Open Source Strategies, Inc.
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
 *  
-->
<@import location="component://opentaps-common/webapp/common/includes/lib/opentapsFormMacros.ftl"/>
<@form name="deleteEntryForm" url="deleteAcctgTransEntry" acctgTransId=acctgTransEntry.acctgTransId acctgTransEntrySeqId=acctgTransEntry.acctgTransEntrySeqId/>
<div class="screenlet-header">
    <div style="float: right;">
<a class="buttontext" href="updateAcctgTransEntryForm?acctgTransId=${acctgTransEntry.acctgTransId}&acctgTransEntrySeqId=${acctgTransEntry.acctgTransEntrySeqId}">${uiLabelMap.CommonEdit}</a>
<@submitFormLink form="deleteEntryForm" text=uiLabelMap.CommonDelete class="buttontext"/>
    </div>
    <div class="boxhead">
        ${uiLabelMap.FinancialsTransactionEntry}
    </div>
</div>
