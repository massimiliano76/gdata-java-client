/* Copyright (c) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.google.gdata.data.extensions;

import com.google.gdata.data.BaseFeed;
import com.google.gdata.data.ExtensionProfile;
import com.google.gdata.data.Kind;

/**
 * The Message class customizes the generic BaseEntry class to define
 * a feed of Message entries.
 *
 * 
 * 
 */
@Kind.Term(MessageEntry.MESSAGE_KIND)
public class MessageFeed extends BaseFeed<MessageFeed, MessageEntry> {

  /**
   * Constructs a new {@code MessageFeed} instance that is parameterized to
   * contain {@code MessageEntry} instances.
   */
  public MessageFeed() {
    super(MessageEntry.class);
    getCategories().add(MessageEntry.MESSAGE_CATEGORY);
  }

  /**
   * Constructs a new {@code MessageFeed} instance that is initialized using
   * data from another BaseFeed instance.
   */
  public MessageFeed(BaseFeed<?, ?> sourceFeed) {
    super(MessageEntry.class, sourceFeed);
    getCategories().add(MessageEntry.MESSAGE_CATEGORY);
  }

  @Override
  public void declareExtensions(ExtensionProfile extProfile) {
    super.declareExtensions(extProfile);

    // Add any feed-level extension declarations here.
  }

  // Any feed-level extension accessor APIs would go here
}
