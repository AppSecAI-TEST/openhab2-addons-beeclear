/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.beeclear;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link BeeClearBindingConstants} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Wim Vissers - Initial contribution
 */
public class BeeClearBindingConstants {

    private static final String BINDING_ID = "beeclear";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_METER = new ThingTypeUID(BINDING_ID, "meter");

    // List of all Channel ids
    public static final String CHANNEL_POWER = "power";
    public static final String CHANNEL_USED_HIGH = "usedHigh";
    public static final String CHANNEL_USED_LOW = "usedLow";
    public static final String CHANNEL_ENGINE = "engine";

}
