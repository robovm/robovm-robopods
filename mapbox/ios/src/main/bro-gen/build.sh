#!/bin/sh

# This script builds/updates the java bindings from the Mapbox headers

# Adjust path to where you have installed bro-gen

BROPATH=../../../../../../robovm-bro-gen

# Run the command
$BROPATH/bro-gen.rb ../java/ mapbox.yaml

