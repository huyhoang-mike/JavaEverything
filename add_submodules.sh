#!/bin/bash

# Check if a target directory argument is provided
if [ -z "$1" ]; then
    echo "Usage: ./add_submodules.sh /path/to/target/directory"
    exit 1
fi

# Use the first argument as the target directory
target_dir="$1"

# Create the target directory if it doesn't exist
mkdir -p "$target_dir"

# Change to the target directory
cd "$target_dir" || exit 1

# Array of repository URLs
repos=(
    "https://inf-git.th-rosenheim.de/studnguyhu5698/sdb_exercise02.git"
    "https://inf-git.th-rosenheim.de/studnguyhu5698/sdb_exercise03.git"
)

# Clone each repository
for repo in "${repos[@]}"; do
    git submodule add "$repo"
done
