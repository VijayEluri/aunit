/**
 *
 * Copyright 2010-2011 (C) The original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.toolazydogs.aunit.internal;

/**
 *
 */
public class PreorderException extends Exception
{
    public PreorderException()
    {
    }

    public PreorderException(String message)
    {
        super(message);
    }

    public PreorderException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public PreorderException(Throwable cause)
    {
        super(cause);
    }
}
