/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.fabric.answers;

import org.robovm.apple.foundation.NSNumber;

public final class RatingEvent extends AnswersEvent<RatingEvent> {
    protected NSNumber rating;
    protected String contentName;
    protected String contentType;
    protected String contentId;

    public RatingEvent putContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }

    public RatingEvent putContentName(String contentName) {
        this.contentName = contentName;
        return this;
    }

    public RatingEvent putContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public RatingEvent putRating(int rating) {
        this.rating = NSNumber.valueOf(rating);
        return this;
    }
}
