package io.github.gianpamx.bicitoday.record

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.gianpamx.bicitoday.R
import kotlinx.android.synthetic.main.record_fragment.*

class RecordFragment : Fragment(), RecordPresenter.View {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.record_fragment, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recordFloatingActionButton.setOnClickListener {
            (activity as? RecordFragmentContainer)?.onRecordClick()
        }

        pauseFloatingActionButton.setOnClickListener {
            (activity as? RecordFragmentContainer)?.onPauseClick()
        }
    }

    override fun showRecordButton() {
        pauseFloatingActionButton.visibility = View.GONE
        recordFloatingActionButton.visibility = View.VISIBLE
    }

    override fun showPauseButton() {
        recordFloatingActionButton.visibility = View.GONE
        pauseFloatingActionButton.visibility = View.VISIBLE
    }

    interface RecordFragmentContainer {
        fun onRecordClick()
        fun onPauseClick()
    }
}
