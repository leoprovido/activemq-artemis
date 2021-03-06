/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.artemis.core.client.impl;

import org.apache.activemq.artemis.api.core.RoutingType;
import org.apache.activemq.artemis.api.core.SimpleString;
import org.apache.activemq.artemis.api.core.client.ClientSession;

public class QueueQueryImpl implements ClientSession.QueueQuery {

   private final boolean exists;

   private final boolean durable;

   private final boolean temporary;

   private final long messageCount;

   private final SimpleString filterString;

   private final int consumerCount;

   private final SimpleString address;

   private final SimpleString name;

   private final boolean autoCreateQueues;

   private final boolean autoCreated;

   private final RoutingType routingType;

   private final boolean purgeOnNoConsumers;

   private final int maxConsumers;

   private final Boolean exclusive;

   private final Boolean groupRebalance;

   private final Integer groupBuckets;

   private final Boolean lastValue;

   private final SimpleString lastValueKey;

   private final Boolean nonDestructive;

   private final Integer consumersBeforeDispatch;

   private final Long delayBeforeDispatch;


   private final Integer defaultConsumerWindowSize;

   public QueueQueryImpl(final boolean durable,
                         final boolean temporary,
                         final int consumerCount,
                         final long messageCount,
                         final SimpleString filterString,
                         final SimpleString address,
                         final SimpleString name,
                         final boolean exists) {
      this(durable, temporary, consumerCount, messageCount, filterString, address, name, exists, false);
   }

   public QueueQueryImpl(final boolean durable,
                         final boolean temporary,
                         final int consumerCount,
                         final long messageCount,
                         final SimpleString filterString,
                         final SimpleString address,
                         final SimpleString name,
                         final boolean exists,
                         final boolean autoCreateQueues) {
      this(durable, temporary, consumerCount, messageCount, filterString, address, name, exists, autoCreateQueues, -1, false, false, RoutingType.MULTICAST);
   }

   public QueueQueryImpl(final boolean durable,
                         final boolean temporary,
                         final int consumerCount,
                         final long messageCount,
                         final SimpleString filterString,
                         final SimpleString address,
                         final SimpleString name,
                         final boolean exists,
                         final boolean autoCreateQueues,
                         final int maxConsumers,
                         final boolean autoCreated,
                         final boolean purgeOnNoConsumers,
                         final RoutingType routingType) {
      this(durable, temporary, consumerCount, messageCount, filterString, address, name, exists, autoCreateQueues, maxConsumers, autoCreated, purgeOnNoConsumers, routingType, null, null, null);
   }

   public QueueQueryImpl(final boolean durable,
                         final boolean temporary,
                         final int consumerCount,
                         final long messageCount,
                         final SimpleString filterString,
                         final SimpleString address,
                         final SimpleString name,
                         final boolean exists,
                         final boolean autoCreateQueues,
                         final int maxConsumers,
                         final boolean autoCreated,
                         final boolean purgeOnNoConsumers,
                         final RoutingType routingType,
                         final Boolean exclusive,
                         final Boolean lastValue,
                         final Integer defaultConsumerWindowSize) {
      this(durable, temporary, consumerCount, messageCount, filterString, address, name, exists, autoCreateQueues, maxConsumers, autoCreated, purgeOnNoConsumers, routingType, exclusive, null, null, lastValue, null, null, null, null, defaultConsumerWindowSize);
   }

   public QueueQueryImpl(final boolean durable,
                         final boolean temporary,
                         final int consumerCount,
                         final long messageCount,
                         final SimpleString filterString,
                         final SimpleString address,
                         final SimpleString name,
                         final boolean exists,
                         final boolean autoCreateQueues,
                         final int maxConsumers,
                         final boolean autoCreated,
                         final boolean purgeOnNoConsumers,
                         final RoutingType routingType,
                         final Boolean exclusive,
                         final Boolean groupRebalance,
                         final Integer groupBuckets,
                         final Boolean lastValue,
                         final SimpleString lastValueKey,
                         final Boolean nonDestructive,
                         final Integer consumersBeforeDispatch,
                         final Long delayBeforeDispatch,
                         final Integer defaultConsumerWindowSize) {
      this.durable = durable;
      this.temporary = temporary;
      this.consumerCount = consumerCount;
      this.messageCount = messageCount;
      this.filterString = filterString;
      this.address = address;
      this.name = name;
      this.exists = exists;
      this.autoCreateQueues = autoCreateQueues;
      this.maxConsumers = maxConsumers;
      this.autoCreated = autoCreated;
      this.purgeOnNoConsumers = purgeOnNoConsumers;
      this.routingType = routingType;
      this.exclusive = exclusive;
      this.groupRebalance = groupRebalance;
      this.groupBuckets = groupBuckets;
      this.lastValue = lastValue;
      this.lastValueKey = lastValueKey;
      this.nonDestructive = nonDestructive;
      this.consumersBeforeDispatch = consumersBeforeDispatch;
      this.delayBeforeDispatch = delayBeforeDispatch;
      this.defaultConsumerWindowSize = defaultConsumerWindowSize;
   }

   @Override
   public SimpleString getName() {
      return name;
   }

   @Override
   public SimpleString getAddress() {
      return address;
   }

   @Override
   public int getConsumerCount() {
      return consumerCount;
   }

   @Override
   public SimpleString getFilterString() {
      return filterString;
   }

   @Override
   public long getMessageCount() {
      return messageCount;
   }

   @Override
   public boolean isDurable() {
      return durable;
   }

   @Override
   public boolean isAutoCreateQueues() {
      return autoCreateQueues;
   }

   @Override
   public boolean isTemporary() {
      return temporary;
   }

   @Override
   public boolean isExists() {
      return exists;
   }

   @Override
   public RoutingType getRoutingType() {
      return routingType;
   }

   @Override
   public int getMaxConsumers() {
      return maxConsumers;
   }

   @Override
   public boolean isPurgeOnNoConsumers() {
      return purgeOnNoConsumers;
   }

   @Override
   public boolean isAutoCreated() {
      return autoCreated;
   }

   @Override
   public Boolean isExclusive() {
      return exclusive;
   }

   @Override
   public Boolean isLastValue() {
      return lastValue;
   }

   @Override
   public SimpleString getLastValueKey() {
      return lastValueKey;
   }

   @Override
   public Boolean isNonDestructive() {
      return nonDestructive;
   }

   @Override
   public Integer getConsumersBeforeDispatch() {
      return consumersBeforeDispatch;
   }

   @Override
   public Long getDelayBeforeDispatch() {
      return delayBeforeDispatch;
   }

   @Override
   public Integer getDefaultConsumerWindowSize() {
      return defaultConsumerWindowSize;
   }

   @Override
   public Boolean isGroupRebalance() {
      return groupRebalance;
   }

   @Override
   public Integer getGroupBuckets() {
      return groupBuckets;
   }
}

