#!/bin/bash


while true;
	do scrcpy --v4l2-sink=/dev/video0 --no-window --audio-source=playback --audio-dup;
	# do scrcpy --v4l2-sink=/dev/video0 --audio-source=playback --audio-dup;
done
