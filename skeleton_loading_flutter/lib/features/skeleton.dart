import 'package:flutter/cupertino.dart';
import 'package:skeleton_loading_flutter/utils/constants.dart';

class Skeleton extends StatelessWidget {
  const Skeleton({super.key, this.height, this.width});

  final double? height;
  final double? width;

  @override
  Widget build(BuildContext context) {
    return Container(
      height: height,
      width: width,
      padding: const EdgeInsets.all(defaultPadding / 2),
      decoration: const BoxDecoration(
        color: CupertinoColors.systemGrey5,
        borderRadius: BorderRadius.all(Radius.circular(defaultPadding)),
      ),
    );
  }
}


class CircleSkeleton extends StatelessWidget {
  const CircleSkeleton({super.key, this.size = 24});

  final double? size;

  @override
  Widget build(BuildContext context) {
    return Container(
      height: size,
      width: size,
      decoration: const BoxDecoration(
        color: CupertinoColors.systemGrey5,
        shape: BoxShape.circle,
      ),
    );
  }
}
